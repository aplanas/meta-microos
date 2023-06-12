SUMMARY = "Jackson module that uses Paranamer to introspect names of constructor params"
DESCRIPTION = "Module that uses Paranamer library to auto-detect names of Creator \
(constructor, static factory method, annotated with @JsonCreator) methods."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-paranamer-2.13.3-1.7.noarch.rpm"
RPM_HASH = "dead045de3858dba3bb328a371c230813294e7deb85bd4db3bf87093e758e015d5e546deb1717a94b51d045e1dc7518140420f3386a85077bc2b5b7dc0e54c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-paranamer \
mvn(com.fasterxml.jackson.module:jackson-module-paranamer) \
mvn(com.fasterxml.jackson.module:jackson-module-paranamer:pom:) \
osgi(com.fasterxml.jackson.module.jackson-module-paranamer)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(com.thoughtworks.paranamer:paranamer)"

inherit rpm
