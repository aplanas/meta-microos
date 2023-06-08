SUMMARY = "Javadoc for stax-ex"
DESCRIPTION = "This package contains javadoc for stax-ex."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "1.8"

RPM_NAME = "stax-ex-javadoc-1.8-4.4.noarch.rpm"
RPM_HASH = "072f512fc7872045a6bc345a712b7bddfc27deec69a8f431163f3db0c163c6d66fc5ffa7febfac56e825c111151adab2b9a1d0733046cd1184fd0bac36ce39eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax-ex-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
