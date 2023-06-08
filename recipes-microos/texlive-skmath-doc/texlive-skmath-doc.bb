SUMMARY = "Documentation for texlive-skmath"
DESCRIPTION = "This package includes the documentation for texlive-skmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5asvn52411"

RPM_NAME = "texlive-skmath-doc-2023.201.0.0.5asvn52411-57.1.noarch.rpm"
RPM_HASH = "0da7f2240d5725700f0015a3a516d344048ab13df901c3c8f9dbda3a2437f0a88171a1454e78250f3541a2a1b8f79ff2c9da0a91cffa0c38b05b2e990ccd3e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skmath-doc"
RDEPENDS:${PN} += ""

inherit rpm
