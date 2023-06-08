SUMMARY = "Draw labyrinths and solution paths"
DESCRIPTION = "The labyrinth package provides code and an environment for \
typesetting simple labyrinths with LaTeX, and generating an \
automatic or manual solution path."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn33454"

RPM_NAME = "texlive-labyrinth-2023.201.1.0svn33454-55.1.noarch.rpm"
RPM_HASH = "ae144aa23d837845e5777dd7e97eb5be6a630c8cdeec2791406a855ba1ac4e779bcd9daae1dfd886566cb5ce02e6103004192ec83d70f429502b73959798fdfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(labyrinth.sty) texlive-labyrinth"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(picture.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
