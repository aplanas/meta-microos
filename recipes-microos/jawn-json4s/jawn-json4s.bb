SUMMARY = "Support to parse to json4s AST"
DESCRIPTION = "Jawn is a JSON parser that was designed to parse \
JSON into an AST as quickly as possible. \
 \
This package contains support to parse to json4s AST."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "jawn-json4s-0.14.1-2.10.noarch.rpm"
RPM_HASH = "0bdaea49a787a33143e06b0169a2c96279a93175a091cd0f78f513f4fb7ec6b89b977c20f3d6dc20e205d3e26712dadf3228b156f2c2403689b76f4359738b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jawn-json4s mvn(org.spire-math:jawn-json4s_2.10) mvn(org.spire-math:jawn-json4s_2.10:pom:) mvn(org.spire-math:json4s-support_2.10) mvn(org.spire-math:json4s-support_2.10:pom:) mvn(org.typelevel:jawn-json4s_2.10) mvn(org.typelevel:jawn-json4s_2.10:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.json4s:json4s-ast_2.10) mvn(org.scala-lang:scala-library) mvn(org.typelevel:jawn-parser_2.10) mvn(org.typelevel:jawn-util_2.10)"

inherit rpm
