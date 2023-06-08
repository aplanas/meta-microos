SUMMARY = "Documentation for texlive-hep"
DESCRIPTION = "This package includes the documentation for texlive-hep"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hep-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "f56cfa1fdd3e4241e266112b5d4304ed11c6af551fad65722ae2d1ed57fe29ad7925454f9c2fcb1929041c27021e3f4b5641755acd5c096f45ef17384c3d9a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-doc"
RDEPENDS:${PN} += ""

inherit rpm
