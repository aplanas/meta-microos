SUMMARY = "Jackson datatypes: collections"
DESCRIPTION = "This is a multi-module umbrella project for various Jackson \
Data-type modules to support 3rd party Collection libraries. \
 \
Currently included are: \
* Guava data-type \
* HPPC data-type \
* PCollections data-type"
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-datatypes-collections-2.13.3-1.7.noarch.rpm"
RPM_HASH = "8587eff5ba8d31fa96645e1b8823bac20fc5efa2f07be51dbb732612748552fb14c8ec740b3462dbe07da432f5dc2521c6c941339e6307885ada74a73bb37789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections \
mvn(com.fasterxml.jackson.datatype:jackson-datatypes-collections:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(com.fasterxml.jackson:jackson-base:pom:)"

inherit rpm
