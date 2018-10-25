package com.spotify.zoltar

import com.spotify.scio.bigquery._

object Tables {

  @BigQueryType.fromTable("data-integration-test:zoltar.iris")
  class Record

}