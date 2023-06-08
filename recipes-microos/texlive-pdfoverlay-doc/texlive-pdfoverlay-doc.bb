SUMMARY = "Documentation for texlive-pdfoverlay"
DESCRIPTION = "This package includes the documentation for texlive-pdfoverlay"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn64210"

RPM_NAME = "texlive-pdfoverlay-doc-2023.201.1.3svn64210-51.1.noarch.rpm"
RPM_HASH = "ff93437ed0ad7504f03f9870ff706d30f17d6f0a505bdb83e4355d18d96047438d81e46f19936233427ad07329a1dc4121a427455337896a6acd86ea68e04616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfoverlay-doc"
RDEPENDS:${PN} += ""

inherit rpm
