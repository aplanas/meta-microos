SUMMARY = "Simulate Win10, Ubuntu, and Mac terminals"
DESCRIPTION = "This LaTeX3 package provides environments terminal and \
terminal*, and macros \\termfile and \\termfile* to simulate \
Win10, Ubuntu and Mac terminals. It is based on tcolorbox, \
minted and listings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn61414"

RPM_NAME = "texlive-termsim-2023.201.1.1.1svn61414-54.1.noarch.rpm"
RPM_HASH = "6c561c34849091818e02147105bdddd0364729573538720b8c98803acba23627ee503cce75472b14deab34418e588370e2b95bd73d552329f40c48fe85c7ea5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(termsim.sty) texlive-termsim"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amssymb.sty) tex(etoolbox.sty) tex(expl3.sty) tex(fontawesome5.sty) tex(l3keys2e.sty) tex(tcolorbox.sty) tex(varwidth.sty) tex(xcolor.sty) tex(xparse.sty) tex(xtemplate.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
