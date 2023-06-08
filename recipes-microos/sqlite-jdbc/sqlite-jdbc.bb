SUMMARY = "SQLite JDBC Driver"
DESCRIPTION = "SQLite JDBC is a library for accessing and creating SQLite database files in \
Java. \
 \
Our SQLiteJDBC library requires no configuration since native libraries for \
major OSs, including Windows, Mac OS X, Linux etc., are assembled into a single \
JAR (Java Archive) file. The usage is quite simple; download our sqlite-jdbc \
library, then append the library (JAR file) to your class path."
LICENSE = "Apache-2.0"

PV = "3.41.2.1"

RPM_NAME = "sqlite-jdbc-3.41.2.1-1.1.aarch64.rpm"
RPM_HASH = "ef6e921c8ab0edfa793e1e0dccf876abedd21b5c8d4d39816abea71c850a472e363a9e8d470714a2ffe3ea043c80159be6b1a25cb9f42df61aeec76d26334391"

RPROVIDES:${PN} += "mvn(org.xerial:sqlite-jdbc) mvn(org.xerial:sqlite-jdbc:pom:) osgi(org.xerial.sqlite-jdbc) sqlite-jdbc sqlite-jdbc(aarch-64)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
