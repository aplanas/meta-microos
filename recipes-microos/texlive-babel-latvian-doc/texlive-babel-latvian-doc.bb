SUMMARY = "Documentation for texlive-babel-latvian"
DESCRIPTION = "This package includes the documentation for texlive-babel-latvian"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn46681"

RPM_NAME = "texlive-babel-latvian-doc-2023.201.2.0bsvn46681-53.1.noarch.rpm"
RPM_HASH = "66d3099b9ba09683cd8ab483ae643d5068fc44dda0b3aa49e6e0789ffbed7cfea0dbea3514c4db132133daa12bc1d69de26ccaa18ec90969575d5c745fc20947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-latvian-doc"
RDEPENDS:${PN} += ""

inherit rpm
