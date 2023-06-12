SUMMARY = "Jackson module to make integration with Guice a bit easier"
DESCRIPTION = "This extension allows Jackson to delegate ObjectMapper creation and value \
injection to Guice when handling data bindings."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-guice-2.13.3-1.7.noarch.rpm"
RPM_HASH = "3e3d37cc4fa8f9255a63d65a3e0881c470ef30d00900c70c30b81c6c57589c677b790683369aa1548e00bcf931b1477caf79aa5a15ba00a4b62280a92bbb358f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-guice \
mvn(com.fasterxml.jackson.module:jackson-module-guice) \
mvn(com.fasterxml.jackson.module:jackson-module-guice:pom:) \
osgi(com.fasterxml.jackson.module.jackson-module-guice)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-annotations) \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(com.google.inject:guice)"

inherit rpm
