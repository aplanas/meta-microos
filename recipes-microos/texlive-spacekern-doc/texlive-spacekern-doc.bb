SUMMARY = "Documentation for texlive-spacekern"
DESCRIPTION = "This package includes the documentation for texlive-spacekern"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn63552"

RPM_NAME = "texlive-spacekern-doc-2023.201.0.0.1asvn63552-57.1.noarch.rpm"
RPM_HASH = "533bbe14eb1e150e39a853d963238c8e515cd1cf51babab1217e6200bdcd726647a878d397ab0f64410c776194921939b160a6b71410521a33fcbad1c4c3d6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spacekern-doc"
RDEPENDS:${PN} += ""

inherit rpm
