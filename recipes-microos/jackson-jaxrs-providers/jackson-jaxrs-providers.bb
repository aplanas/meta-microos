SUMMARY = "Jackson JAX-RS providers"
DESCRIPTION = "This is a multi-module project that contains Jackson-based JAX-RS providers for \
following data formats: JSON, Smile (binary JSON), XML, CBOR (another kind of \
binary JSON), YAML."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-providers-2.13.3-1.7.noarch.rpm"
RPM_HASH = "a2dc87f6fe32ec10488c2befeacc0e8e6374922cae967bd29020a00cf90288f86ad1e2cfd17c6924592d07b0048c2de74079db4dd23fbb9ff89882f73ece1aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers \
mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-base) \
mvn(com.fasterxml.jackson.jaxrs:jackson-jaxrs-base:pom:) \
osgi(com.fasterxml.jackson.jaxrs.jackson-jaxrs-base)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind)"

inherit rpm
