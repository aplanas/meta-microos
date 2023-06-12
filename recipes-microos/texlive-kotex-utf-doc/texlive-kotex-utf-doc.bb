SUMMARY = "Documentation for texlive-kotex-utf"
DESCRIPTION = "This package includes the documentation for texlive-kotex-utf"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.0svn63690"

RPM_NAME = "texlive-kotex-utf-doc-2023.201.3.0.0svn63690-55.1.noarch.rpm"
RPM_HASH = "b8bd7b154e080ada1e8cdd33919f6d81fe85150c2a3ba1258ef506b26b152f299c43d6904c5bc79c202fb1362e0bc350d609ab0cf42a455effba6cd25bcae0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-kotex-utf-doc:ko) \
texlive-kotex-utf-doc"
RDEPENDS:${PN} += ""

inherit rpm
