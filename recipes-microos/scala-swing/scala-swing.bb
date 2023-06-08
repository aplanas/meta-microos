SUMMARY = "The swing library for the Scala programming languages"
DESCRIPTION = "This package contains the swing library for the Scala programming languages. \
This library is required to develop GUI-related applications in Scala. \
The release provided by this package is not the original version from upstream \
because this version is not compatible with JDK 1.7."
LICENSE = "BSD-3-Clause & CC0-1.0 & SUSE-Public-Domain"

PV = "2.10.7"

RPM_NAME = "scala-swing-2.10.7-8.8.noarch.rpm"
RPM_HASH = "1e41257a6992a54a6b909688010346ab46e8da48fe0c59316f1e7b0479077ef3b9a8ab61e5585461b25a95ef6b1893e6a56efdfd38aaa1e46ee7472b8045fff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.scala-lang:scala-swing) mvn(org.scala-lang:scala-swing:pom:) scala-swing"
RDEPENDS:${PN} += "java java-headless javapackages-filesystem mvn(org.scala-lang:scala-library) scala"

inherit rpm
