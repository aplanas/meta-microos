SUMMARY = "Typeset formal grammars"
DESCRIPTION = "This package provides a new environment and associated commands \
to typeset BNF grammars. It allows to easily write formal \
grammars. Its original motivation was to typeset grammars for \
beamer presentations, therefore, there are macros to emphasize \
or downplay some parts of the grammar (which is the main \
novelty compared to other BNF packages)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61955"

RPM_NAME = "texlive-formal-grammar-2023.201.1.2svn61955-52.1.noarch.rpm"
RPM_HASH = "17811b53bc24b9673ea9b1a46978aa901892297936d73d4e334c5fcb22ebcb1391f77a4f627e182a2bfab784bcef4099575fb078a65c2b6ffcd126601bf29b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(formal-grammar.sty) texlive-formal-grammar"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(colortbl.sty) tex(newfloat.sty) tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
