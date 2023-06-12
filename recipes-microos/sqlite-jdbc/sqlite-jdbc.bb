SUMMARY = "SQLite JDBC Driver"
DESCRIPTION = "SQLite JDBC is a library for accessing and creating SQLite database files in \
Java. \
 \
Our SQLiteJDBC library requires no configuration since native libraries for \
major OSs, including Windows, Mac OS X, Linux etc., are assembled into a single \
JAR (Java Archive) file. The usage is quite simple; download our sqlite-jdbc \
library, then append the library (JAR file) to your class path."
LICENSE = "Apache-2.0"

PV = "3.42.0.0"

RPM_NAME = "sqlite-jdbc-3.42.0.0-1.1.aarch64.rpm"
RPM_HASH = "f192cffcb1f92030cae3bb5a8847078e3a8b438f18cba4bd3b96ba92a42e95399ef29c79becdfe561851232f6276906c2d55b1c35b4a0824b5a26a1900fadf33"

RPROVIDES:${PN} += "mvn(org.xerial:sqlite-jdbc) \
mvn(org.xerial:sqlite-jdbc:pom:) \
osgi(org.xerial.sqlite-jdbc) \
sqlite-jdbc \
sqlite-jdbc(aarch-64)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
