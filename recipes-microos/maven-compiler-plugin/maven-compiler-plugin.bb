SUMMARY = "Maven Compiler Plugin"
DESCRIPTION = "The Compiler Plugin is used to compile the sources of your project."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "maven-compiler-plugin-3.10.1-1.11.noarch.rpm"
RPM_HASH = "c9a38f4bbab94264cce285004042855e7b6199e14a5bad8a43cc99f654e93f5cc2770483deec6d8dd1655e815e468973f0bcd4ddbe28bfe58737f46aaf6ec10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-compiler-plugin mvn(org.apache.maven.plugins:maven-compiler-plugin) mvn(org.apache.maven.plugins:maven-compiler-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.shared:maven-shared-incremental) mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.codehaus.plexus:plexus-compiler-api) mvn(org.codehaus.plexus:plexus-compiler-javac) mvn(org.codehaus.plexus:plexus-compiler-manager) mvn(org.codehaus.plexus:plexus-java)"

inherit rpm
