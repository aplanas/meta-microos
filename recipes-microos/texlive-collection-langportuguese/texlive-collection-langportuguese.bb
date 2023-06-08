SUMMARY = "Portuguese"
DESCRIPTION = "Support for Portuguese."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-collection-langportuguese-2023.201.svn54074-56.1.noarch.rpm"
RPM_HASH = "56200f2de64ce21aba14bfe9f7505de1e2fde6601bbaa6218d346e51f677ece484b1b052503b9558d5084e99681391c5a7072a3ab6457c3f83834a6e095778ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langportuguese"
RDEPENDS:${PN} += "texlive-babel-portuges texlive-beamer-tut-pt texlive-collection-basic texlive-cursolatex texlive-feupphdteses texlive-hyphen-portuguese texlive-latex-via-exemplos texlive-latexcheat-ptbr texlive-lshort-portuguese texlive-numberpt texlive-ordinalpt texlive-xypic-tut-pt"

inherit rpm
