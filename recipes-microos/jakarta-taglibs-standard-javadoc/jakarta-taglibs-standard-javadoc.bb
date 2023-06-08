SUMMARY = "Javadoc for jakarta-taglibs-standard"
DESCRIPTION = "This package contains the javadoc documentation for Jakarta Taglibs."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "jakarta-taglibs-standard-javadoc-1.1.2-2.6.noarch.rpm"
RPM_HASH = "ea439b44566e7f81537e3704363c7a3f489b73f3a996d460d07a34b44f3c20c354c039dbd67f274cd39f008149a60d4e67ecfe92baa2cdefd9032f441be445c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-taglibs-standard-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
