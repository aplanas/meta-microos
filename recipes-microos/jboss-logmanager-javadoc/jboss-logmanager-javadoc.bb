SUMMARY = "Javadoc for jboss-logmanager"
DESCRIPTION = "This package contains the API documentation for jboss-logmanager."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "jboss-logmanager-javadoc-2.0.4-1.20.noarch.rpm"
RPM_HASH = "426dde8f4ab44aa6fcabce3708b5ace0b2538ea7ca05107af2cfe46c2b01330c03418ff7ad6cf3bf4ef8144c128c8df76c32fa0f40ebc1d6e919fc7e676ff148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logmanager-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
