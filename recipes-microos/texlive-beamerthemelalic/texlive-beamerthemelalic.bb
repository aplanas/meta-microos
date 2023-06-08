SUMMARY = "A beamer theme for LALIC"
DESCRIPTION = "This package provides the beamer theme for LALIC (Laboratorio \
de Linguistica e Inteligencia Computacional of the Federal \
University of Sao Carlos, Brazil)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn58777"

RPM_NAME = "texlive-beamerthemelalic-2023.201.1.0svn58777-53.1.noarch.rpm"
RPM_HASH = "2c2972126289b8b04efa234b49c1ca848b75cf8ccc2255a1a0263d8c7c5d0c96caf99ee5e1f41c77097a610f4076ee61eaae0e08a248ee56f891d0445d334ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemelalic.sty) tex(beamerfontthemelalic.sty) tex(beamerinnerthemelalic.sty) tex(beamerouterthemelalic.sty) tex(beamerthemelalic.sty) texlive-beamerthemelalic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calculator.sty) tex(tikz.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
