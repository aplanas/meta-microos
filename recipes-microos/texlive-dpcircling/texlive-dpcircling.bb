SUMMARY = "Decorated text boxes using TikZ"
DESCRIPTION = "This simple package provides four types of text decorations \
using TikZ. You can frame your text with circles, rectangles, \
jagged rectangles, and fan-shapes. The baseline will be \
adjusted properly according to the surroundings. You can use \
these decorations both in text mode and in math mode. You can \
specify line color, line width, width, and height using option \
keys. Note: The 'DP' in the package name stands for 'Decorated \
Packets'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54994"

RPM_NAME = "texlive-dpcircling-2023.201.1.0svn54994-52.1.noarch.rpm"
RPM_HASH = "05a9b9961aa51b8b040d79a2d3ef69183b0b928d56afffad59ee945e90259ad1b74cb211716f4553bddd2d4af72fbcbbb3e77e7ea17ce9b9c92057bebfcf92bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(DPcircling.sty) \
texlive-dpcircling"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
