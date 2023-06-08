SUMMARY = "Documentation for texlive-yax"
DESCRIPTION = "This package includes the documentation for texlive-yax"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn54080"

RPM_NAME = "texlive-yax-doc-2023.201.1.03svn54080-52.1.noarch.rpm"
RPM_HASH = "d4cb64a1c049ee295c58a3b5916eb1e7165f267e80a954016e27d9228bb9d4e93ee1428b51daafe5d6b831df6302017ccb67a737fde488220171e92e699850e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yax-doc"
RDEPENDS:${PN} += ""

inherit rpm
