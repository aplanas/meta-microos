SUMMARY = "Documentation for texlive-tikzorbital"
DESCRIPTION = "This package includes the documentation for texlive-tikzorbital"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn36439"

RPM_NAME = "texlive-tikzorbital-doc-2023.201.svn36439-52.1.noarch.rpm"
RPM_HASH = "f6617542eb9260bbb0f81f6f0b9ff15bbebcd88d0c0f2d9d65c2b1458593de857d9000dac234d110c8481214190dcd123c9ee3d54152ad899e1cbb4df0ed0769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzorbital-doc"
RDEPENDS:${PN} += ""

inherit rpm
