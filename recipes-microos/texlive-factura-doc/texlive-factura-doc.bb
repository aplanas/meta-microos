SUMMARY = "Documentation for texlive-factura"
DESCRIPTION = "This package includes the documentation for texlive-factura"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.32svn61697"

RPM_NAME = "texlive-factura-doc-2023.201.4.32svn61697-52.1.noarch.rpm"
RPM_HASH = "d77f6c89e84afdfc007e8dfb3eb42aada78bdcb3e3919417443f8b6972edd0995b7f8529e487e2f39bcb30ef66f6cf4e1ff6058ad92c60794c030b612bd7abb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-factura-doc:es_VE) texlive-factura-doc"
RDEPENDS:${PN} += ""

inherit rpm
