SUMMARY = "Typeset recipes in note-card-sized boxes"
DESCRIPTION = "The recipecard class typesets recipes into note card sized \
boxes that can then be cut out and pasted on to note cards. The \
recipe then looks elegant and fits in the box of recipes."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-recipecard-2023.201.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "1201be98ae437111f4a6fee20d2d421ef57f00b453394f004cf62d0b1b0ba6a933da74afa00a01a770666446424714c66ede2e38cf1057cbda92f7ad431132e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(recipecard.cls) texlive-recipecard"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(boxedminipage.sty) tex(calc.sty) tex(geometry.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
