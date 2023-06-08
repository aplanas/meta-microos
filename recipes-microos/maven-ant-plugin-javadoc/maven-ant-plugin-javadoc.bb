SUMMARY = "Javadoc for maven-ant-plugin"
DESCRIPTION = "API documentation for maven-ant-plugin."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "maven-ant-plugin-javadoc-2.4-3.10.noarch.rpm"
RPM_HASH = "a305bde98e1b09294da776547b53b672b351807f52bece987226ed1e702e09e2680291d7a8a582b94d9e3615ca1c327e24e044469176137738b4d479d521db3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-ant-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
