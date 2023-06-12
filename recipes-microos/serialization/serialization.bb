SUMMARY = "Sbt wrapper around Scala pickling"
DESCRIPTION = "sbt serialization is a wrapper around Scala pickling focused \
on sbt's usage. In particular it provides: \
    * JSON format that's nice \
    * static-only core picklers"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "serialization-0.1.2-1.16.noarch.rpm"
RPM_HASH = "9999c088e56ad45446093ca2d211ddfa39ce7815cc2eb4e64400ab978f244e2c2a42515dd1b27bdf09176ae5fb2809ac0196d55185c71309ed44b898a4406354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.scala-sbt:serialization_2.10) \
mvn(org.scala-sbt:serialization_2.10:pom:) \
serialization"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.json4s:json4s-ast_2.10) \
mvn(org.scala-lang.modules:scala-pickling_2.10) \
mvn(org.scala-lang:scala-library) \
mvn(org.typelevel:jawn-json4s_2.10) \
mvn(org.typelevel:jawn-parser_2.10)"

inherit rpm
