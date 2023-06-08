SUMMARY = "JUL to SLF4J bridge"
DESCRIPTION = "JUL to SLF4J bridge."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "jul-to-slf4j-1.7.36-3.3.noarch.rpm"
RPM_HASH = "023c523481eee5a1083ad8a7f72139cf38960e22e2b23f0594057427f00ee7691a7319b6c11e04f8487ad1ab7fe181c7a40970555882385d7ae57108ac3054fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jul-to-slf4j mvn(org.slf4j:jul-to-slf4j) mvn(org.slf4j:jul-to-slf4j:pom:) osgi(jul.to.slf4j)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.slf4j:slf4j-api)"

inherit rpm
