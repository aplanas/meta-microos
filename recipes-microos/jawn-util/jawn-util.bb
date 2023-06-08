SUMMARY = "A few helpful utilities"
DESCRIPTION = "Jawn is a JSON parser that was designed to parse \
JSON into an AST as quickly as possible. \
 \
This package contains a few helpful utilities."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "jawn-util-0.14.1-2.10.noarch.rpm"
RPM_HASH = "967e4815f0ab32f04ce90cf61a1efdb1d29e026cefe0816e99a2c591938d7f8fcd12778a80ffefbb80258ba922e1831116811398dc05f6bc4b04d7a9c55f2e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jawn-util mvn(org.spire-math:jawn-util_2.10) mvn(org.spire-math:jawn-util_2.10:pom:) mvn(org.typelevel:jawn-util_2.10) mvn(org.typelevel:jawn-util_2.10:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.scala-lang:scala-library) mvn(org.typelevel:jawn-parser_2.10)"

inherit rpm
