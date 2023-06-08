SUMMARY = "Documentation for texlive-pst-vowel"
DESCRIPTION = "This package includes the documentation for texlive-pst-vowel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-doc-2023.201.1.0svn25228-53.1.noarch.rpm"
RPM_HASH = "a9bc70017d3ee72a425471a5ddae2c5f8d4c39ddd49a29bf51b2d48db71da4b197dff502a304ac1d75b6f85d8eb09e88851c6bb1cf7193430dca102f6bbfec28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-vowel-doc"
RDEPENDS:${PN} += ""

inherit rpm
