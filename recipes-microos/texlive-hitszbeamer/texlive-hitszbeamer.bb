SUMMARY = "A beamer theme for Harbin Institute of Technology, ShenZhen"
DESCRIPTION = "This is a beamer theme designed for Harbin Institute of \
Technology, ShenZhen (HITSZ)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-2023.201.1.0.0svn54381-53.1.noarch.rpm"
RPM_HASH = "6c5a24c53fad729011a7186f26e1160d12e41edae6fb4887a8795621d0c63b8aa907025e7a2ac2bcbe37b48756b97535cea4c5d177046c4ebb5ac18b13ab9a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemehitszbeamer.sty) tex(beamerinnerthemehitszbeamer.sty) tex(beamerouterthemehitszbeamer.sty) tex(beamerthemehitszbeamer.sty) texlive-hitszbeamer"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(ctex.sty) tex(multicol.sty) tex(multimedia.sty) tex(natbib.sty) tex(pgf.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
