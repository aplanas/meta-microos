SUMMARY = "Three dimensional lighting effects (PSTricks)"
DESCRIPTION = "A PSTricks package for three dimensional lighting effects on \
characters and PSTricks graphics, like lines, curves, plots, \
..."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn15878"

RPM_NAME = "texlive-pst-light3d-2023.201.0.0.12svn15878-52.1.noarch.rpm"
RPM_HASH = "44fbe9a7b8882b7ebbbb8a83904edbb5cc7e041c9d598838b12a0510a3088e5134883399490f98c6bdd4119db582512774efb9d75e0f21cbae816cf613251d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-light3d.sty) tex(pst-light3d.tex) texlive-pst-light3d"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
