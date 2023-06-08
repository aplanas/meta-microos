SUMMARY = "Draw rulers on the foreground or in the text"
DESCRIPTION = "This package draws horizontal and vertical rulers on the \
foreground of every (or the current) page at absolute \
positions. In this way, you can check the page layout \
dimensions. You can also draw various rulers in the text. The \
fgruler package requires the services of the following \
packages: kvoptions, etoolbox, xcolor, graphicx, eso-pic."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn63721"

RPM_NAME = "texlive-fgruler-2023.201.1.5svn63721-52.1.noarch.rpm"
RPM_HASH = "6e291bb75f0eb87cf6ea3e5f812455ad78cd4270789b5f2c16d76f9f1dea05c7433c5d6362d21c3d5b45deaa8f0b0525d8dee91ac9dab444e4aaf1893ff18563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fgruler.sty) texlive-fgruler"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(eso-pic.sty) tex(etoolbox.sty) tex(graphicx.sty) tex(kvoptions.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
