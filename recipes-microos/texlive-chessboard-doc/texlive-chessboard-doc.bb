SUMMARY = "Documentation for texlive-chessboard"
DESCRIPTION = "This package includes the documentation for texlive-chessboard"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn56833"

RPM_NAME = "texlive-chessboard-doc-2023.201.1.9svn56833-53.1.noarch.rpm"
RPM_HASH = "cf08dfa299de0ff4f95ca0d6e5fa2f95a706f4de1ca15b225ca905b6c2a506f318004f33e8385cbf34b2605f716051ff490712a48c8d92c74e74e9aa435f5f65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chessboard-doc"
RDEPENDS:${PN} += ""

inherit rpm
