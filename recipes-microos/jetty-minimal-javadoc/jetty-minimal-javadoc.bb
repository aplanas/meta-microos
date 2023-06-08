SUMMARY = "Javadoc for jetty-minimal"
DESCRIPTION = "Javadoc for jetty-minimal."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-minimal-javadoc-9.4.48-3.1.noarch.rpm"
RPM_HASH = "c6d2a4cb6c71e997f644959fc316039d96c05a95aba53bf2d4717c3dac4442e4575bac103185a292f1e84cd63b67b874658ff0682e4cfdf30b83e799e4332f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-minimal-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
