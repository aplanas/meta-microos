SUMMARY = "Jenkins JSON library"
DESCRIPTION = "JSON-lib is a java library for transforming beans, maps, collections, java \
arrays and XML to JSON and back again to beans and DynaBeans. \
 \
This package contains JSON library used in Jenkins."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "jenkins-json-lib-2.4-6.10.noarch.rpm"
RPM_HASH = "c832ccf61061deb4b614d9ee7b341f78691538def8428afffaa779bebe65bc0feaf4c0f2029b15c6aeb0401173d5e4411c37002ef6b3ad608171c898fe0c6ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jenkins-json-lib mvn(org.kohsuke.stapler:json-lib) mvn(org.kohsuke.stapler:json-lib:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-beanutils:commons-beanutils) mvn(commons-collections:commons-collections) mvn(commons-lang:commons-lang) mvn(commons-logging:commons-logging) mvn(net.sf.ezmorph:ezmorph)"

inherit rpm
