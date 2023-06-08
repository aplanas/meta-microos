SUMMARY = "JSON library for Java"
DESCRIPTION = "JSON-lib is a java library for transforming beans, maps, collections, java \
arrays and XML to JSON and back again to beans and DynaBeans."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "json-lib-2.4-6.10.noarch.rpm"
RPM_HASH = "b39166120e2e098f808c209e3c6a766bba6a05380175ba23575fe1b4b8d6ddc552622504bbe6abc0872ca1a683e0c85e0dd8f9a1162e6771c0140de3828d7085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-lib mvn(net.sf.json-lib:json-lib) mvn(net.sf.json-lib:json-lib:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-beanutils:commons-beanutils) mvn(commons-collections:commons-collections) mvn(commons-lang:commons-lang) mvn(commons-logging:commons-logging) mvn(net.sf.ezmorph:ezmorph)"

inherit rpm
