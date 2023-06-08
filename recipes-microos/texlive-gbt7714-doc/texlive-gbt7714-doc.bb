SUMMARY = "Documentation for texlive-gbt7714"
DESCRIPTION = "This package includes the documentation for texlive-gbt7714"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.5svn64633"

RPM_NAME = "texlive-gbt7714-doc-2023.201.2.1.5svn64633-52.1.noarch.rpm"
RPM_HASH = "7bdc5e6e6fda9bffe4f1bc83569286e3e7bd40f4c5c47c20d68baec52656c5b87d3acfb49a115f7828de4da885db9915a576adc07ec356f667abf4e8150770c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-gbt7714-doc:zh) texlive-gbt7714-doc"
RDEPENDS:${PN} += ""

inherit rpm
