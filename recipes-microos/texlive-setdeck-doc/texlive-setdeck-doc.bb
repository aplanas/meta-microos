SUMMARY = "Documentation for texlive-setdeck"
DESCRIPTION = "This package includes the documentation for texlive-setdeck"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn40613"

RPM_NAME = "texlive-setdeck-doc-2023.201.0.0.1svn40613-53.1.noarch.rpm"
RPM_HASH = "d709df107b712b5a6216de056db9bd43bcef71df0223b0194affa383875f1371d88259ad7b2f6a39ed062ad81427a54a64314f349b5bc471e561cd21e5dde8f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-setdeck-doc"
RDEPENDS:${PN} += ""

inherit rpm
