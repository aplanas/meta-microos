SUMMARY = "Jackson module that uses byte-code generation to further speed up data binding"
DESCRIPTION = "Module that will add dynamic bytecode generation for standard Jackson POJO \
serializers and deserializers, eliminating majority of remaining data binding \
overhead."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-afterburner-2.13.3-1.7.noarch.rpm"
RPM_HASH = "4a465b1880fead8fe97fd4e4a28a6a6926a02eb99c0943f611ae211808c158d432d08843158060709c4904a5c1658d4495adf86a46c25c695d268017c2fd7c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-afterburner \
mvn(com.fasterxml.jackson.module:jackson-module-afterburner) \
mvn(com.fasterxml.jackson.module:jackson-module-afterburner:pom:) \
osgi(com.fasterxml.jackson.module.jackson-module-afterburner)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(org.ow2.asm:asm)"

inherit rpm
