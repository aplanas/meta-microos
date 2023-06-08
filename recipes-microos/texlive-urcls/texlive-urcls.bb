SUMMARY = "Beamer and scrlttr2 classes and styles for the University of Regensburg"
DESCRIPTION = "The bundle provides a beamer-derived class and a theme style \
file for the corporate design of the University of Regensburg. \
It also contains a scrlttr2-derived class for letters using the \
corporate design of the UR. Users may use the class itself \
(URbeamer) or use the theme in the usual way with \
\\usetheme{UR}. Examples of using both letters and presentations \
are provided as .tex and .pdf-files."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn49903"

RPM_NAME = "texlive-urcls-2023.201.2.1svn49903-53.1.noarch.rpm"
RPM_HASH = "ad3fb5b455afb7c696e0d8aba10656f886323d4b1581337bd0fc13bb7ef2144a187796e217b45359fef04d23336b3cfbc4448ce88a81e3092ffa84c6cbdca5d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(URbeamer.cls) tex(URcolors.sty) tex(URletter.cls) tex(URoptions.sty) tex(URpagestyles.sty) tex(URrules.sty) tex(URspecialopts.sty) tex(beamercolorthemeUR.sty) tex(beamerfontthemeUR.sty) tex(beamerouterthemeUR.sty) tex(beamerthemeUR.sty) texlive-urcls"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(beamer.cls) tex(expl3.sty) tex(iftex.sty) tex(inputenc.sty) tex(l3keys2e.sty) tex(scrlayer-scrpage.sty) tex(scrlttr2.cls) tex(textcase.sty) tex(tikz.sty) tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
