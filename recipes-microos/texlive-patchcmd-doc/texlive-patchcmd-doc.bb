SUMMARY = "Documentation for texlive-patchcmd"
DESCRIPTION = "This package includes the documentation for texlive-patchcmd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn41379"

RPM_NAME = "texlive-patchcmd-doc-2023.201.1.05svn41379-51.1.noarch.rpm"
RPM_HASH = "77b9473f39213f85eddc61777ef3b5bc2abb1f97cc06db1b333acbc2122c34b27d896df11d1f7952f6714bc8910b833f9a879011fbb3a93ccde56bb4296e0be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patchcmd-doc"
RDEPENDS:${PN} += ""

inherit rpm
