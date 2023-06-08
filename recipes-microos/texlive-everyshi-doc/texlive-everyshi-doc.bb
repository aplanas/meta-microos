SUMMARY = "Documentation for texlive-everyshi"
DESCRIPTION = "This package includes the documentation for texlive-everyshi"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.00svn57001"

RPM_NAME = "texlive-everyshi-doc-2023.201.4.00svn57001-52.1.noarch.rpm"
RPM_HASH = "f670c691d6f2d63c5e6f4b453cd78b018a8fbe23d2bc0356d655231c2bbc9ed4ae26bb367875a67213cef7a2880b6a53fbfa4f409a8d0c21348fd19a7d7ac94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everyshi-doc"
RDEPENDS:${PN} += ""

inherit rpm
