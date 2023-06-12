SUMMARY = "Java.net parent POM file"
DESCRIPTION = "Java.net parent POM file used by most Java.net subprojects such as \
Glassfish"
LICENSE = "Apache-2.0"

PV = "4"

RPM_NAME = "jvnet-parent-4-1.11.noarch.rpm"
RPM_HASH = "c2b2d83ed7d46178af6a19800734891e47c049cabfcb4df21707d46a63da67b5cc59536a1168f7ada4798762111045926de4f500f6646572de024007a2006d24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jvnet-parent \
mvn(net.java:jvnet-parent:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
