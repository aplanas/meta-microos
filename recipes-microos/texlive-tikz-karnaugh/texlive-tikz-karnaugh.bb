SUMMARY = "Typeset Karnaugh maps using TikZ"
DESCRIPTION = "The tikz-karnaugh package is a LaTeX package used to draw \
Karnaugh maps. It uses TikZ to produce high quality graph from \
1 to 12 variables, but this upper limit depends on the TeX \
memory usage and can be different for you. It is very good for \
presentation since TikZ allows for a better control over the \
final appearance of the map. You can control colour, styles and \
distances. It can be considered as an upgrade and extension of \
Andreas W. Wieland's karnaugh package towards TikZ supporting. \
Upgrade because uses TikZ for more option on typesetting and \
overall higher quality. Extension because it also supports \
American style and inputting the values as they would appear in \
the map or in the truth table. Complex maps with solution \
(implicants) pointed out can be generated with external java \
software (see documentation for details). It supports both \
American and traditional (simplified labels) styles and from \
version 1.3 on American style is natively supported, therefore, \
no more addition work is required to typeset Gray coded labels, \
variable names etc. From version 1.4, two new macros allow \
typesetting a map much more similarly as it should appear. \
Original order, as the values appear in the truth table, still \
being supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn62040"

RPM_NAME = "texlive-tikz-karnaugh-2023.201.1.5svn62040-52.1.noarch.rpm"
RPM_HASH = "ef10600befb6207dd502373d49b1ed23ee1bbf4da67e599b4bccffb543ad5ed9766ac24b24073a5760d37b6a0a90eb779ca930657cb4fcf0fdbf9c1f96b15c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibrarykarnaugh.code.tex) texlive-tikz-karnaugh"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
