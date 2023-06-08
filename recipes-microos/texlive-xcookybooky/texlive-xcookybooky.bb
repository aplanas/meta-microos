SUMMARY = "Typeset (potentially long) recipes"
DESCRIPTION = "The package enables the user to typeset recipes, which could be \
greater than one page. Above the recipe text two (optional) \
pictures can be displayed. Other features are recipe name, \
energy content, portions, preparation and baking time, baking \
temperatures, recipe source and of course preparation steps and \
required ingredients. At the bottom you may insert an optional \
hint. The package depends on the Emerald fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-2023.201.1.5svn36435-52.1.noarch.rpm"
RPM_HASH = "aaa8017aef5d14865321edd8ab891b5bab25a87dcfa6919cd71cdaf42921e2449589afb6d87ec50e90fa68b581858bbc8989483f334271cb80dc3eb2e6ea151a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xcookybooky.cfg) tex(xcookybooky.sty) texlive-xcookybooky"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(cookingsymbols.sty) tex(eso-pic.sty) tex(fancyhdr.sty) tex(framed.sty) tex(graphicx.sty) tex(iflang.sty) tex(ifsym.sty) tex(ifthen.sty) tex(lettrine.sty) tex(picture.sty) tex(tabulary.sty) tex(tikz.sty) tex(units.sty) tex(wrapfig.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
