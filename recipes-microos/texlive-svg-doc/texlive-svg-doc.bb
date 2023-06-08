SUMMARY = "Documentation for texlive-svg"
DESCRIPTION = "This package includes the documentation for texlive-svg"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.02ksvn57010"

RPM_NAME = "texlive-svg-doc-2023.201.2.02ksvn57010-57.1.noarch.rpm"
RPM_HASH = "52197e50feea34c35e8644f141811b2061c14aaa448f135e953091c5e9dd64b62d4145964017e00eea963c77c35a1ce09c790690ee3ea66193e4b7945ddf0f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svg-doc"
RDEPENDS:${PN} += ""

inherit rpm
