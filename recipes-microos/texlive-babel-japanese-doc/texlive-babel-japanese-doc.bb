SUMMARY = "Documentation for texlive-babel-japanese"
DESCRIPTION = "This package includes the documentation for texlive-babel-japanese"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57733"

RPM_NAME = "texlive-babel-japanese-doc-2023.201.svn57733-53.1.noarch.rpm"
RPM_HASH = "8ddcaa8ea27bab0a62db49b5a891d5a3e1a0912456420dd6c43711e19d9893cb8badf6f36dffd355c7b77c9b3d8c6d0eecaeb7addca57c03898955b368b27373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) locale(texlive-babel-japanese-doc:ja;en texlive-babel-japanese-doc"
RDEPENDS:${PN} += ""

inherit rpm
