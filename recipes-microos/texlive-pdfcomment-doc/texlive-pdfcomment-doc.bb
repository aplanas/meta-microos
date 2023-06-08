SUMMARY = "Documentation for texlive-pdfcomment"
DESCRIPTION = "This package includes the documentation for texlive-pdfcomment"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4asvn49047"

RPM_NAME = "texlive-pdfcomment-doc-2023.201.2.4asvn49047-51.1.noarch.rpm"
RPM_HASH = "129793d0fecc889616203f4f62882b856673b991859af5564f2d92d75b2b332b0b2a06d67fb6692a516b0da9dc5f192d6628bf5c3b7b3d10c5d07f3a8d699742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pdfcomment-doc:en;de) texlive-pdfcomment-doc"
RDEPENDS:${PN} += ""

inherit rpm
