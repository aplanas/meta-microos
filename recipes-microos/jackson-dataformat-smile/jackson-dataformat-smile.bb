SUMMARY = "Support for reading and writing Smile encoded data using Jackson abstractions"
DESCRIPTION = "This Jackson extension handles reading and writing of data encoded in Smile \
data format ('binary JSON'). It extends standard Jackson streaming API \
(JsonFactory, JsonParser, JsonGenerator), and as such works seamlessly with \
all the higher level data abstractions (data binding, tree model, and \
pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-smile-2.13.3-1.7.noarch.rpm"
RPM_HASH = "6b2ffc834106242bb2b9739a2e942663b075b4ab677478961b362f3b7edfcfc1bf1b4d671af4a6c2c7dbeb91dfc32f73ac5f83fc57c18c11ca0e4c7b2041c38a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-smile mvn(com.fasterxml.jackson.dataformat:jackson-dataformat-smile) mvn(com.fasterxml.jackson.dataformat:jackson-dataformat-smile:pom:) osgi(com.fasterxml.jackson.dataformat.jackson-dataformat-smile)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.fasterxml.jackson.core:jackson-core) mvn(com.fasterxml.jackson.core:jackson-databind)"

inherit rpm
