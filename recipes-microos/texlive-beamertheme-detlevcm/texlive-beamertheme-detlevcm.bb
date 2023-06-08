SUMMARY = "A beamer theme designed for use in the University of Leeds"
DESCRIPTION = "The bundle provides a simple theme that has been used in the \
author's department."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02svn39048"

RPM_NAME = "texlive-beamertheme-detlevcm-2023.201.1.02svn39048-53.1.noarch.rpm"
RPM_HASH = "4230d3ec092abb8131d27604be85a1d2957a9648caecc789552b58a613648158bbfab4de3f3b272c3ef0f1a87edb0d5eec86a86d3da6ed141f315db35310e85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeETII.sty) tex(beamerfontthemeDetlevCM.sty) tex(beamerouterthemeDetlevCM.sty) tex(beamerthemeDetlevCM.sty) texlive-beamertheme-detlevcm"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
