SUMMARY = "API documentation for jetty-build-support"
DESCRIPTION = "API documentation for jetty-build-support."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.5"

RPM_NAME = "jetty-build-support-javadoc-1.5-2.9.noarch.rpm"
RPM_HASH = "650aa5f7f433e64d15d1f4d5be12f3f0ed3df7a666f897fbf073847191f69a0433eb6df4292d30c7b630c79b306d14234beba56d0133eb6bed3996a8b7b78b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-build-support-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
