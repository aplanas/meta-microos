SUMMARY = "Typesetting reasoned calculations, also called calculational proofs"
DESCRIPTION = "The calculation environment formats reasoned calculations, also \
called calculational proofs. The notion of reasoned \
calculations or calculational proofs was originally advocated \
by Wim Feijen and Edsger Dijkstra. The package accepts options \
fleqn and leqno (with the same effect as the LaTeX options \
fleqn and leqno, or may inherit the options from the document \
class). It allows steps and expressions to be numbered (by \
LaTeX equation numbers, obeying the LaTeX \\label command to \
refer to these numbers), and a step doesn't take vertical space \
if its hint is empty. An expression in a calculation can be \
given a comment; it is placed at the side opposite to the \
equation numbers. Calculations are allowed inside hints \
although numbering and commenting is then disabled."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35973"

RPM_NAME = "texlive-calculation-2023.201.1.0svn35973-52.1.noarch.rpm"
RPM_HASH = "c46354a888e85a2c56c8eb9126f4d348f478a71e9d6e549de58957c91702dc2bec0d8227e26683b49dd1b9b317737d78578a10e3db75b2c9decd5ce04b8a873d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(calculation.sty) texlive-calculation"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(delarray.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
