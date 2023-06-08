SUMMARY = "Documentation for texlive-pst-stru"
DESCRIPTION = "This package includes the documentation for texlive-pst-stru"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-doc-2023.201.0.0.13svn38613-53.1.noarch.rpm"
RPM_HASH = "d78b432d6a3daec02e3bbb4ccb9393857845836c1f82ce4f6fb03035c36e8a712c9fb4b45dcd2a14ebd83bb54707e91984ad51b6e3c692d8f60dd7c9be7c1ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-stru-doc"
RDEPENDS:${PN} += ""

inherit rpm
