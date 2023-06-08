SUMMARY = "Documentation for texlive-kvoptions"
DESCRIPTION = "This package includes the documentation for texlive-kvoptions"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.15svn63622"

RPM_NAME = "texlive-kvoptions-doc-2023.201.3.15svn63622-55.1.noarch.rpm"
RPM_HASH = "1b6a7dab77f437037b4f1171aa7624e4ec45df81947010a4762600ffd2e755fb311b0e8ea1ea22a59f6e82598c89e6802e2b4099fbc4fd6d2e101472bfe9e9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-kvoptions-doc:en) texlive-kvoptions-doc"
RDEPENDS:${PN} += ""

inherit rpm
