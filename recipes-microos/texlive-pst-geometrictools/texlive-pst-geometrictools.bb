SUMMARY = "A PSTricks package to draw geometric tools"
DESCRIPTION = "This PSTricks package facilitates the drawing of protractors, \
rulers, compasses and pencils."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn61430"

RPM_NAME = "texlive-pst-geometrictools-2023.201.1.3svn61430-52.1.noarch.rpm"
RPM_HASH = "29ffad872cf1eac684667bb206dd78036f95a7a6c227515fc7cd68cee1d7c3f8bfb03fad7836e07bcd9da63ddc87dce47fb358ce00c8dd1dc8e65604d07f4bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-geometrictools.sty) tex(pst-geometrictools.tex) texlive-pst-geometrictools"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
