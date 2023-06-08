SUMMARY = "Documentation for texlive-niceframe"
DESCRIPTION = "This package includes the documentation for texlive-niceframe"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1csvn36086"

RPM_NAME = "texlive-niceframe-doc-2023.201.1.1csvn36086-54.1.noarch.rpm"
RPM_HASH = "d838143dbd24d844d5c8340634cce6075fe30fc48e1d4b1bf8dce6de4f581f84bea09558470e0de8d83e150abe414dfa6bd91271005410f174d66643a288c128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-niceframe-doc"
RDEPENDS:${PN} += ""

inherit rpm
