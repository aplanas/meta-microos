SUMMARY = "Spanish"
DESCRIPTION = "Support for Spanish."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54141"

RPM_NAME = "texlive-collection-langspanish-2023.201.svn54141-56.1.noarch.rpm"
RPM_HASH = "c3e5b34baf1082990fc362f9d5e3a13d3cc43669917a257c4baa8d7fecec891399e7b6ea72eb72c223660f4fbc0f22bb206061cea01e90b680419069ca640b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langspanish"
RDEPENDS:${PN} += "texlive-babel-catalan texlive-babel-galician texlive-babel-spanish texlive-collection-basic texlive-es-tex-faq texlive-hyphen-catalan texlive-hyphen-galician texlive-hyphen-spanish texlive-l2tabu-spanish texlive-latex2e-help-texinfo-spanish texlive-latexcheat-esmx texlive-lshort-spanish texlive-texlive-es"

inherit rpm
