SUMMARY = "Documentation for texlive-tikzpagenodes"
DESCRIPTION = "This package includes the documentation for texlive-tikzpagenodes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64967"

RPM_NAME = "texlive-tikzpagenodes-doc-2023.201.1.1svn64967-52.1.noarch.rpm"
RPM_HASH = "425d37b088d10ceb239ff15acf3710af1aef3b5823a721327f2afac951a1ea299ead02c24fc7c716e46e69a1c78ae3115165abae353d6fedabeeb5ffae294688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpagenodes-doc"
RDEPENDS:${PN} += ""

inherit rpm
