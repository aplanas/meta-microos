SUMMARY = "Maven Archetype Catalog model"
DESCRIPTION = "Maven Archetype Catalog model."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-catalog-3.2.1-1.9.noarch.rpm"
RPM_HASH = "e95f27f1fc86fc680ed2ce848566c5a4864a4966ce85398da2555159e4895b44f5929af25ea884c2e3ec7c1a563918165842a65c5ca9a80854264aed2b8601cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-catalog mvn(org.apache.maven.archetype:archetype-catalog) mvn(org.apache.maven.archetype:archetype-catalog:pom:) osgi(org.apache.maven.archetype.catalog)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
