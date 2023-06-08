SUMMARY = "Documentation for texlive-tufte-latex"
DESCRIPTION = "This package includes the documentation for texlive-tufte-latex"
LICENSE = "Apache-1.0"

PV = "2023.201.3.5.2svn37649"

RPM_NAME = "texlive-tufte-latex-doc-2023.201.3.5.2svn37649-52.1.noarch.rpm"
RPM_HASH = "989efeebcab2cbad86612b65a93a478549f0eb4256d4bcaf72f6ac06f292c4e182c55a6c9712ef870ad808ebea0b63b2b85aa657d06ac05bf1a485f82515a81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tufte-latex-doc"
RDEPENDS:${PN} += ""

inherit rpm
