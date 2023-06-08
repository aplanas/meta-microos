SUMMARY = "Documentation for texlive-orientation"
DESCRIPTION = "This package includes the documentation for texlive-orientation"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn57390"

RPM_NAME = "texlive-orientation-doc-2023.201.1.0svn57390-54.1.noarch.rpm"
RPM_HASH = "76fb113295d579e5cb9108ba265f2a398175457c7290049ec6e250428643ee39a25bf8ddc27e1ce9c02000335a02816ecfa54d3e20c4696578684f58c73041a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orientation-doc"
RDEPENDS:${PN} += ""

inherit rpm
