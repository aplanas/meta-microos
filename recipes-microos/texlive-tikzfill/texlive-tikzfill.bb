SUMMARY = "TikZ libraries for filling with images and patterns"
DESCRIPTION = "This is a collection of TikZ libraries which add further \
options to fill TikZ paths with images and patterns. The \
libraries comprise fillings with images from files and from \
TikZ pictures. Also, patterns of hexagons and of rhombi are \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn63947"

RPM_NAME = "texlive-tikzfill-2023.201.1.0.0svn63947-52.1.noarch.rpm"
RPM_HASH = "e97e161cd8acc4f68029c3b797313dc4d97df6c321dcd409e9fe30256fc75edcc6b61a5e36d181541b43371548ab03483e8c89c0df661bee76f2d5678391f3c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzfill-common.sty) tex(tikzfill.hexagon.sty) tex(tikzfill.image.sty) tex(tikzfill.rhombus.sty) tex(tikzfill.sty) tex(tikzlibraryfill.hexagon.code.tex) tex(tikzlibraryfill.image.code.tex) tex(tikzlibraryfill.rhombus.code.tex) texlive-tikzfill"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
