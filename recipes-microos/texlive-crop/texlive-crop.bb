SUMMARY = "Support for cropmarks"
DESCRIPTION = "A package providing corner marks for camera alignment as well \
as for trimming paper stacks, and additional page information \
on every page if required. Most macros are easily adaptable to \
personal preferences. An option is provided for selectively \
suppressing graphics or text, which may be useful for printing \
just colour graphics on a colour laser printer and the rest on \
a cheap mono laser printer. A page info line contains the time \
and a new cropmarks index and is printed at the top of the \
page. A configuration command is provided for the info line \
font. Options for better collaboration with dvips, pdfTeX and \
vtex are provided."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.10.2svn55424"

RPM_NAME = "texlive-crop-2023.204.1.10.2svn55424-54.1.noarch.rpm"
RPM_HASH = "8329be35bb2a3f6d19fed6528667f78601bfc8f44d9c701e3009c543ba616a01e976c3ae1a38b7ff31bb65488c1d6fa35eb050b614ad94c324000f8e93f43316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(crop.sty) texlive-crop"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(graphics.sty) tex(ifluatex.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
