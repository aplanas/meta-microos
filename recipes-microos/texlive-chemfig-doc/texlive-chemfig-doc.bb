SUMMARY = "Documentation for texlive-chemfig"
DESCRIPTION = "This package includes the documentation for texlive-chemfig"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6dsvn65912"

RPM_NAME = "texlive-chemfig-doc-2023.201.1.6dsvn65912-53.1.noarch.rpm"
RPM_HASH = "9c055eb948b2caaf6f064dcb54a67626429ea0c93b6cc935d0867a9f3f855e22a1281d3a04106342ff7d38321a8e9f394e46ffa9079bb53aac37c3e3b0d08dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chemfig-doc:en;fr) \
texlive-chemfig-doc"
RDEPENDS:${PN} += ""

inherit rpm
