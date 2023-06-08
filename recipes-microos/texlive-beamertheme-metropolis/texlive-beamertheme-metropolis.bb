SUMMARY = "A modern LaTeX beamer theme"
DESCRIPTION = "The package provides a simple, modern Beamer theme for anyone \
to use. It tries to minimize noise and maximize space for \
content."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn43031"

RPM_NAME = "texlive-beamertheme-metropolis-2023.201.1.2svn43031-53.1.noarch.rpm"
RPM_HASH = "7bb7b2bbaef9b74afa76ebbe72776b1bba6716e909f8bb49a68ceb4d772711248db2631aced9c4b754516a272672422b67fd6c2b9dd4e1ecb569c6dbc27e717a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthememetropolis-highcontrast.sty) tex(beamercolorthememetropolis.sty) tex(beamerfontthememetropolis.sty) tex(beamerinnerthememetropolis.sty) tex(beamerouterthememetropolis.sty) tex(beamerthememetropolis.sty) tex(pgfplotsthemetol.sty) texlive-beamertheme-metropolis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(etoolbox.sty) tex(fontspec.sty) tex(ifluatex.sty) tex(ifxetex.sty) tex(keyval.sty) tex(pgfopts.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
