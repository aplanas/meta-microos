SUMMARY = "FML module for maven-doxia"
DESCRIPTION = "This package provides FML module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-fml-1.9.1-6.7.noarch.rpm"
RPM_HASH = "0979c94f1dd05e2dbdc60035d2e43f1181eafafc7aff7a66e00d12491530cae60feaf1b7085a5a06a039aedf912c80ab8316d1fa5ad050766141e498567c5b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-fml mvn(org.apache.maven.doxia:doxia-module-fml) mvn(org.apache.maven.doxia:doxia-module-fml:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.doxia:doxia-core) mvn(org.apache.maven.doxia:doxia-sink-api) mvn(org.codehaus.plexus:plexus-component-annotations) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
