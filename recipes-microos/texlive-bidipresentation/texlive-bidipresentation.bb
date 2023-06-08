SUMMARY = "Experimental bidi presentation"
DESCRIPTION = "A great portion of the code is borrowed from the texpower \
bundle, with modifications to get things working properly in \
both right to left and left to right modes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn35267"

RPM_NAME = "texlive-bidipresentation-2023.201.0.0.3svn35267-53.1.noarch.rpm"
RPM_HASH = "3641dc9871242be11725db465b336b72715e1c9bcaa7eb47791e2f734f51db78042857cb3e5fed9c0370a93317f2596c1a8fe706f82d4d7e391d21b62dd48d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bidiprescolors.cfg) tex(bidipresentation.cls) texlive-bidipresentation"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(calc.sty) tex(color.sty) tex(fancyhdr.sty) tex(geometry.sty) tex(hyperref.sty) tex(ifthen.sty) tex(keyval.sty) tex(scrlfile.sty) tex(xecolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
