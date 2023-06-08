SUMMARY = "Documentation for texlive-typoaid"
DESCRIPTION = "This package includes the documentation for texlive-typoaid"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.7svn44238"

RPM_NAME = "texlive-typoaid-doc-2023.201.0.0.4.7svn44238-52.1.noarch.rpm"
RPM_HASH = "f6f140b272b3f5b7ff0a7404f17d66f280c5086a8823fe0b442c8fc35f17986dab022d225d28af8d717dd3ef10eec076d35a5fe14cebb8b39ad046685d0bbc13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typoaid-doc"
RDEPENDS:${PN} += ""

inherit rpm
