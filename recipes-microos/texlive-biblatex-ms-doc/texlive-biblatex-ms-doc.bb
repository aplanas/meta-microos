SUMMARY = "Documentation for texlive-biblatex-ms"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ms"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0_1svn66480"

RPM_NAME = "texlive-biblatex-ms-doc-2023.201.4.0_1svn66480-53.1.noarch.rpm"
RPM_HASH = "05f344dc02b3b7a9958f6cb79810114510be8f1cba63f1bf3b450b42069bd6874b7708d05fe6e2c4640e07429427d3e91690c9b4ef567c6caad6914b633df03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-ms-doc:en) texlive-biblatex-ms-doc"
RDEPENDS:${PN} += ""

inherit rpm
