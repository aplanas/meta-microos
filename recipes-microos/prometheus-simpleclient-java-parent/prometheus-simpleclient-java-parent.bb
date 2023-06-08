SUMMARY = "Prometheus Java Suite parent pom"
DESCRIPTION = "The Prometheus Java Suite: Client Metrics, Exposition, and Examples."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-parent-0.8.0-6.10.noarch.rpm"
RPM_HASH = "caa0b91adfafea063a044a78a48beb49da04f5f6d762035e230431c7e9cdd098a5aa328e203207bde4d3e30a268b5a7819d22832d2179506b92799e76642163d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:parent:pom:) prometheus-simpleclient-java-parent"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.felix:maven-bundle-plugin) mvn(org.apache.maven.plugins:maven-compiler-plugin) mvn(org.apache.maven.plugins:maven-javadoc-plugin) mvn(org.apache.maven.plugins:maven-surefire-plugin) mvn(org.sonatype.oss:oss-parent:pom:)"

inherit rpm
