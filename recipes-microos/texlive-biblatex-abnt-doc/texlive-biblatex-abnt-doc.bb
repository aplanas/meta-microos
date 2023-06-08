SUMMARY = "Documentation for texlive-biblatex-abnt"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-abnt"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn49179"

RPM_NAME = "texlive-biblatex-abnt-doc-2023.201.3.4svn49179-53.1.noarch.rpm"
RPM_HASH = "356835270a66322142ecb95718050259e9d5746df764882ce276d5cde355628329f38a59c1c81178764c38eb8431911db4253b4b533bc96fc9127b78b7f12fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-abnt-doc:pt_BR) texlive-biblatex-abnt-doc"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
