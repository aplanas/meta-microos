SUMMARY = "Documentation for texlive-abntex2"
DESCRIPTION = "This package includes the documentation for texlive-abntex2"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.7svn49248"

RPM_NAME = "texlive-abntex2-doc-2023.201.1.9.7svn49248-54.1.noarch.rpm"
RPM_HASH = "143215428a69efd13405dcbdeef2c8cd87d6e3368a81344d7cc8aca2aef94abc1d42226430bdb89d1e05b4cc8ed267a38a0939ef408d0d318a65e5a26b6fda25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-abntex2-doc:pt_BR) texlive-abntex2-doc"
RDEPENDS:${PN} += ""

inherit rpm
