SUMMARY = "Draw pie charts, using PGF"
DESCRIPTION = "The package provides the means to draw pie (and variant) \
charts, using PGF/TikZ."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7svn63603"

RPM_NAME = "texlive-pgf-pie-2023.201.0.0.7svn63603-51.1.noarch.rpm"
RPM_HASH = "51a99ae4c9370f96d18e8466ce96f765ca60aff1639fe0080a8b748b4127a0d9907fcd7ec19031b9097c97b1bdb468ae360d4737784e6aa9cead0a00b99d2bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgf-pie.sty) tex(tikzlibrarypie.code.tex) texlive-pgf-pie"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tikz.sty) texlive texlive-carlisle texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-latex texlive-pgf texlive-scripts texlive-scripts-bin"

inherit rpm
