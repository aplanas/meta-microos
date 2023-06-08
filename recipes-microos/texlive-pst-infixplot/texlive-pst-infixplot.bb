SUMMARY = "Using PSTricks plotting capacities with infix expressions rather than RPN"
DESCRIPTION = "Plotting functions with pst-plot is very powerful but sometimes \
difficult to learn since the syntax of \\psplot and \
\\parametricplot requires some PostScript knowledge. The \
infix-RPN and pst-infixplot styles simplify the usage of \
pst-plot for the beginner, providing macro commands that \
convert natural mathematical expressions to PostScript syntax."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn15878"

RPM_NAME = "texlive-pst-infixplot-2023.201.0.0.11svn15878-52.1.noarch.rpm"
RPM_HASH = "19a29be47221088ef1a8242e4d45fffe663cb611b69f27f11a5e063fd92e0afbae5fd12e31f87864d297543c269da8302db42bd83a4f48498865fb0596680aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(infix-RPN.sty) tex(infix-RPN.tex) tex(pst-infixplot.sty) tex(pst-infixplot.tex) texlive-pst-infixplot"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
