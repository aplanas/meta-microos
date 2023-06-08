SUMMARY = "Library for describing binary formats for Scala types"
DESCRIPTION = " \
SBinary is a library for describing binary protocols, in the form of \
mappings between Scala types and binary formats. It can be used as a \
robust serialization mechanism for Scala objects or a way of dealing \
with existing binary formats found in the wild. \
 \
It started out life as a loose port of Haskell's Data.Binary. It's \
since evolved a bit from there to take advantage of the features Scala \
implicits offer over Haskell type classes, but the core idea has \
remained the same."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "sbinary-0.4.2-4.1.noarch.rpm"
RPM_HASH = "b0bc3a611674b00a31dca6ce4520155af6fbc2f09646001f89422a28da0e75c4f35db35c486b1402726218a05decb266bca1703cf2cfef6f6aa286b3dd196379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.scala-tools.sbinary:sbinary_2.10) mvn(org.scala-tools.sbinary:sbinary_2.10:pom:) sbinary"
RDEPENDS:${PN} += "java-headless javapackages-filesystem javapackages-tools mvn(org.scala-lang:scala-library) scala"

inherit rpm
