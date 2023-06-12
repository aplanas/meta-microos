SUMMARY = "Documentation for texlive-huaz"
DESCRIPTION = "This package includes the documentation for texlive-huaz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64723"

RPM_NAME = "texlive-huaz-doc-2023.201.1.0svn64723-52.1.noarch.rpm"
RPM_HASH = "555d37fc1021cb7fe1f408b6a0c21bfa89136f09c3568a1e5e6db1ecfae31dade13dd0e46af717f80124ba0cccd25e09d62de4d5497e18f5740e770de488b556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-huaz-doc:hu) \
texlive-huaz-doc"
RDEPENDS:${PN} += ""

inherit rpm
