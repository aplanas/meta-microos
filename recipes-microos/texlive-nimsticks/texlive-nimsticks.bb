SUMMARY = "Draws sticks for games of multi-pile Nim"
DESCRIPTION = "This LaTeX package provides commands \\drawnimstick to draw a \
single nim stick and \\nimgame which represents games of \
multi-pile Nim. Nim sticks are drawn with a little random \
wobble so they look 'thrown together' and not too regular. The \
package also provides options to customise the size and colour \
of the sticks, and flexibility to draw heaps of different \
objects."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.1svn64118"

RPM_NAME = "texlive-nimsticks-2023.201.2.0.1svn64118-54.1.noarch.rpm"
RPM_HASH = "f8a4b5519e3078aae1f25e8d499fbf9741cfc77c578b6cd596c5ac824361ba80c0161d2bb7863c2425d3b4879e41c182a066b4e1bb0f2c18ff073c52e590f839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nimsticks.sty) texlive-nimsticks"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(lcg.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
