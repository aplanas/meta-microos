SUMMARY = "Documentation for texlive-biblatex-chem"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-chem"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1zsvn57904"

RPM_NAME = "texlive-biblatex-chem-doc-2023.201.1.1zsvn57904-53.1.noarch.rpm"
RPM_HASH = "c7b653075020488e3e191125f0d8f25f6ea93ac7924c6734906cc5cf022fab27bb0a066b85d1f2868e55f3dd31d58308486c681fb6647a7595bcc9748e17743d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-chem-doc"
RDEPENDS:${PN} += ""

inherit rpm
