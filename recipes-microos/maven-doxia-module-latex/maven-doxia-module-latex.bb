SUMMARY = "Latex module for maven-doxia"
DESCRIPTION = "This package provides Latex module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-latex-1.9.1-6.7.noarch.rpm"
RPM_HASH = "a6a67ea7f8e805c69034c51feecd31de7fc2734f40e0c3ace6e98f61ac009b9bf0225ca84a759273175db95a45cc32248348143eac0457078155a0a8242cb88b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-latex mvn(org.apache.maven.doxia:doxia-module-latex) mvn(org.apache.maven.doxia:doxia-module-latex:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.doxia:doxia-core) mvn(org.apache.maven.doxia:doxia-sink-api) mvn(org.codehaus.plexus:plexus-component-annotations) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
