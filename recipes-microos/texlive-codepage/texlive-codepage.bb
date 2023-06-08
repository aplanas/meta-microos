SUMMARY = "Support for variant code pages"
DESCRIPTION = "The package provides a mechanism for inputting non-ASCII text. \
Nowadays, the job is mostly done by the inputenc package in the \
LaTeX distribution."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn51502"

RPM_NAME = "texlive-codepage-2023.201.svn51502-53.1.noarch.rpm"
RPM_HASH = "15ee5d1f6d8390e533a458fdd6312abf55e29fa2d6bbb135dafb98fe7c33e0f374ce8d3ba2101e865daca82eeef1a80efd1b45d5ba049d1c79818e92f84e56ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(code437.tex) tex(code850.tex) tex(codeiso1.tex) tex(codemac.tex) tex(codepage.sty) tex(initcar.tex) tex(shapecm.tex) tex(shapedc.tex) texlive-codepage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
