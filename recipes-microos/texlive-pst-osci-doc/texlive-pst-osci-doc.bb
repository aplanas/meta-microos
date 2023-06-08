SUMMARY = "Documentation for texlive-pst-osci"
DESCRIPTION = "This package includes the documentation for texlive-pst-osci"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.82svn15878"

RPM_NAME = "texlive-pst-osci-doc-2023.201.2.82svn15878-52.1.noarch.rpm"
RPM_HASH = "7f067b4cdd9e887054bb6fe48384c39dae6a50cec265b0af1ff8e8b6d91ff9d22aeebeafd37d4ed102725a3251ab8b899e1a4165e2e422733d7df6a64dc5fd00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-osci-doc:fr;en) texlive-pst-osci-doc"
RDEPENDS:${PN} += ""

inherit rpm
