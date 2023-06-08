SUMMARY = "Documentation for texlive-chifoot"
DESCRIPTION = "This package includes the documentation for texlive-chifoot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn57312"

RPM_NAME = "texlive-chifoot-doc-2023.201.1.0svn57312-53.1.noarch.rpm"
RPM_HASH = "5ad2e4226a6c321da233e0634cb9fdefdda12f37febf4201ed23c21f01823c594f26297b0384de443f7b2640b4fd7054625f4e427c2efeb149730ee89dfac4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chifoot-doc"
RDEPENDS:${PN} += ""

inherit rpm
