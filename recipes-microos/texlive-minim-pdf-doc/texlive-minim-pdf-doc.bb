SUMMARY = "Documentation for texlive-minim-pdf"
DESCRIPTION = "This package includes the documentation for texlive-minim-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-pdf-doc-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "a7e6b8dd86de8584ed62884979744b77735d4c8e14c37213e85e228e64b17e5c8ab0d1d689b2168e89bc92decc7d68b23d7a9e03b59419388e44ae01cf30dadb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-pdf-doc"
RDEPENDS:${PN} += ""

inherit rpm
