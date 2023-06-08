SUMMARY = "Documentation for texlive-umthesis"
DESCRIPTION = "This package includes the documentation for texlive-umthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-umthesis-doc-2023.201.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "bda539805c270451351cd432b041fa105a287189bfe5a8b86c0b91e51028581d0db29ff25c0337c05ea8de379829d4091fd9a512e6d0bbcadb36f7d063edd3e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
