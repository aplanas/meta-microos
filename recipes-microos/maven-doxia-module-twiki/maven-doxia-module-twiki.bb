SUMMARY = "TWiki module for maven-doxia"
DESCRIPTION = "This package provides TWiki module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-twiki-1.9.1-6.7.noarch.rpm"
RPM_HASH = "dfcc0b4bb02c5f8c21311b86316836bac0d8530472c2fb4d5b6fe37197d102f5a52930869417a0381fc7bc68fb5145a75ae56b06c0d6e6a9dc6a0061bc696fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-twiki mvn(org.apache.maven.doxia:doxia-module-twiki) mvn(org.apache.maven.doxia:doxia-module-twiki:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.doxia:doxia-core) mvn(org.apache.maven.doxia:doxia-sink-api) mvn(org.codehaus.plexus:plexus-component-annotations) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
