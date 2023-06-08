SUMMARY = "Print EAN13 for ISBN"
DESCRIPTION = "The package provides the means to typeset ISBN codes with \
EAN-13; it uses the (generic) package ean13.tex to typeset the \
actual barcode."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57514"

RPM_NAME = "texlive-ean13isbn-2023.201.svn57514-53.1.noarch.rpm"
RPM_HASH = "a93050f247fde7f494866109b44d5180a42334fc9c533d4879a92753b8325bab9746f5fd06e0fdcb9b7c4f901582867da569b544946751cd76abf1931f04eb6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ean13isbn.sty) texlive-ean13isbn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
