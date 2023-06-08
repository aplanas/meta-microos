SUMMARY = "Documentation for texlive-fundus-calligra"
DESCRIPTION = "This package includes the documentation for texlive-fundus-calligra"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn26018"

RPM_NAME = "texlive-fundus-calligra-doc-2023.201.1.2svn26018-52.1.noarch.rpm"
RPM_HASH = "a83c525fd5cbb9da508d81a6133401b3e8e0af2c9383a0c4ae7891435fe4885315f7b5bd4d30beca1bef3695c9585840c79ca525048d386a4e54be052fab5617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fundus-calligra-doc"
RDEPENDS:${PN} += ""

inherit rpm
