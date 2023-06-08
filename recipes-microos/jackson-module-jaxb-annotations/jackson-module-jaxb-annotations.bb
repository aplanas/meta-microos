SUMMARY = "Support for using JAXB annotations as an alternative to 'native' Jackson annotations"
DESCRIPTION = "This Jackson extension module provides support for using JAXB (javax.xml.bind) \
annotations as an alternative to native Jackson annotations. It is most often \
used to make it easier to reuse existing data beans that used with JAXB \
framework to read and write XML."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-jaxb-annotations-2.13.3-1.7.noarch.rpm"
RPM_HASH = "d20ec075bb2545ad5d609c30c30a0adc9943d139a6d7f620e3e874619288d916480a9c04c5d8bab1e850ef8201b468371b2cf6ae6e9e5de487322866e2fd0d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-jaxb-annotations mvn(com.fasterxml.jackson.module:jackson-module-jaxb-annotations) mvn(com.fasterxml.jackson.module:jackson-module-jaxb-annotations:pom:) osgi(com.fasterxml.jackson.module.jackson-module-jaxb-annotations)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.fasterxml.jackson.core:jackson-annotations) mvn(com.fasterxml.jackson.core:jackson-core) mvn(com.fasterxml.jackson.core:jackson-databind) mvn(javax.activation:javax.activation-api) mvn(javax.xml.bind:jaxb-api)"

inherit rpm
