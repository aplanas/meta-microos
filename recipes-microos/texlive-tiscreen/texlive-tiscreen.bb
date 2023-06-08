SUMMARY = "Mimic the screen of older Texas Instruments calculators"
DESCRIPTION = "This package mimics the screen of older Texas Instruments dot \
matrix display calculators, specifically the TI-82 STATS. It \
relies on the lcd and xcolor packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62602"

RPM_NAME = "texlive-tiscreen-2023.201.svn62602-52.1.noarch.rpm"
RPM_HASH = "7d24ea2ca6d0f82942d4608e46600f7ec53be2dda7607d1c1570e63fbe2c5cd77af53e001720411cd6c5d13e90d25dd68f92528c4d4d230d3877fb0175ca5fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tiscreen.sty) texlive-tiscreen"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(lcd.sty) tex(tcolorbox.sty) tex(textgreek.sty) tex(tikz.sty) tex(tipa.sty) tex(wasysym.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
