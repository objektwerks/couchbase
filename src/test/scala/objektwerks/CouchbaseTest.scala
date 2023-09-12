package objektwerks

import com.couchbase.client.java.CouchbaseCluster
import com.couchbase.client.java.document.JsonDocument
import com.couchbase.client.java.document.json.JsonObject
import com.couchbase.client.java.query.N1qlQuery

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers

import scala.jdk.CollectionConverters.*

class CouchbaseTest extends AnyFunSuite with BeforeAndAfterAll with Matchers:
  val cluster: CouchbaseCluster = CouchbaseCluster.create("127.0.0.1")

  override protected def afterAll(): Unit =
    cluster.disconnect()
    ()

  test("document") {
    val bucket = cluster.openBucket("default")
    val key = "doc-key"
    val content = JsonObject.create.put("doc-name", "doc-value")
    val document = JsonDocument.create(key, content)
    val upserted = bucket.upsert(document)
    val found = bucket.get(key)
    println(s"upserted: $upserted")
    println(s"found: $found")
    upserted shouldEqual found
    bucket.remove(key)
  }

  test("query") {
    val bucket = cluster.openBucket("travel-sample")
    val result = bucket.query(N1qlQuery.simple("SELECT DISTINCT(country) FROM `travel-sample` WHERE type = 'airline' LIMIT 10"))
    result.allRows.asScala.foreach(println)
    result.info.resultCount shouldEqual 3
  }