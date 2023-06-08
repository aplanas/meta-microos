SUMMARY = "Documentation for texlive-qcm"
DESCRIPTION = "This package includes the documentation for texlive-qcm"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn63833"

RPM_NAME = "texlive-qcm-doc-2023.201.2.1svn63833-53.1.noarch.rpm"
RPM_HASH = "7e4f557fb81c831a121f899e6fec9fa7e09e896fbef906316d220aab5d4cb93c70bd788a287e12385ba9693f834ef450b1b0a7d3cd2a9e2c6b3266875162df21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcm-doc"
RDEPENDS:${PN} += ""

inherit rpm
