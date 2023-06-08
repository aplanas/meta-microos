SUMMARY = "Javadoc for jboss-modules"
DESCRIPTION = "This package contains the API documentation for jboss-modules."
LICENSE = "Apache-2.0 & xpp"

PV = "1.5.2"

RPM_NAME = "jboss-modules-javadoc-1.5.2-1.20.noarch.rpm"
RPM_HASH = "a5432cc7316d753e1911bf1412ee13d0b5ce71a297038256b74b615f1b1953e9080b353443f59fd69e9dda0b1dc4f0d2e847a1e9a9487e36a4e9f5f250973fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-modules-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
