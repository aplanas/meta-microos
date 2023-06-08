SUMMARY = "Graphs and Automata Simplified in TeX"
DESCRIPTION = "GasTeX is a set of LaTeX macros which enable the user to draw \
graphs, automata, nets, diagrams, etc., very easily, in the \
LaTeX picture environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn58505"

RPM_NAME = "texlive-gastex-2023.201.3.0svn58505-52.1.noarch.rpm"
RPM_HASH = "2ff9ec9c7c0ddc2a0545e7531b3cf0b9f10f9d576700e067a0b7f19a4e2764bc1b2211a4d351560f069d598afab938d1a645900e76cad09f9919f3157ad87671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gastex.sty) texlive-gastex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(auto-pst-pdf.sty) tex(calc.sty) tex(environ.sty) tex(graphicx.sty) tex(ifpdf.sty) tex(pst-pdf.sty) tex(trig.sty) tex(xcolor.sty) tex(xifthen.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
