SUMMARY = "Graphical representation of keys on a standard scientific calculator"
DESCRIPTION = "This package provides commands to draw scientific calculator \
keys with the help of TikZ. It also provides commands to draw \
the content of screens and of menu items."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36306"

RPM_NAME = "texlive-ticollege-2023.201.1.0svn36306-54.1.noarch.rpm"
RPM_HASH = "707b4174c901f6254dfc5625bf5989c13fd95747c9dd0a221c6eb2c7311e17df0e23e40a065cf32c0fea81656a449a64c66469472a5ddd9c2ba7c80f0175d390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ticollege.sty) texlive-ticollege"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amssymb.sty) tex(ifthen.sty) tex(mathtools.sty) tex(multido.sty) tex(multirow.sty) tex(newtxtt.sty) tex(tikz.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
