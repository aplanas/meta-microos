SUMMARY = "Free form slides with blocks placed on a grid"
DESCRIPTION = "This package allows creating free form slides with blocks \
placed on a grid. The blocks can be filled with text, \
equations, figures etc. The resulting slides are similar to the \
ones produced with LaTeX beamer, but more flexible. Sequential \
unconvering of elements is supported. A compiler script is \
provided which compiles each slide separately, this way \
avoiding long compile times."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-2023.201.0.0.1.1svn54512-53.1.noarch.rpm"
RPM_HASH = "ae77a53a4784c7eea243df8a0a52dea11feda2682707ebfac26a774471ce935fe9b5d6a1d70e258ca45c971c9f174a3e6828ebb8a078075d97dcefb0ea50327d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gridslides.cls) tex(gridslides.sty) texlive-gridslides"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amssymb.sty) tex(amsthm.sty) tex(article.cls) tex(babel.sty) tex(braket.sty) tex(dsfont.sty) tex(enumerate.sty) tex(environ.sty) tex(geometry.sty) tex(hyperref.sty) tex(inputenc.sty) tex(mathtools.sty) tex(microtype.sty) tex(ragged2e.sty) tex(siunitx.sty) tex(tikz.sty) tex(xspace.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
