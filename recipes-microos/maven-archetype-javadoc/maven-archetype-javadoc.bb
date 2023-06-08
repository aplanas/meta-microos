SUMMARY = "API documentation for maven-archetype"
DESCRIPTION = "API documentation for maven-archetype."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-javadoc-3.2.1-1.9.noarch.rpm"
RPM_HASH = "7caf743ef772a374559e8ae7b5bd66ca792945b942103abc4d986f8097159848058914850698ddb2c81ad7572856edf11f3aca0bc7ff96ebb044e0ee8bd9a600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
