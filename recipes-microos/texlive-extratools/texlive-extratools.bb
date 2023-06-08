SUMMARY = "Utilities like DviToDvi, PSToPS, and LaCheck"
DESCRIPTION = "The LaCheck utility is a syntax checker for LaTeX documents. \
 \
The DviToDvi utilities are \
 \
dvibook       rearranges pages into book signatures, adds blank pages \
              as needed \
dviselect     selects pages and page ranges \
dvitodvi      performs general page rearrangement of selected pages \
dviconcat     concatenation of DVI files \
 \
Three simple scripts for scaling DIN A4 pages and rearranging two by \
two onto a DIN A4 page (a4toa5) are included. The number of pages must \
be even (which can be done by odd2even or dvibook)."
LICENSE = "GPL-2.0-or-later & LPPL-1.0 & LGPL-2.1-or-later"

PV = "2023.201"

RPM_NAME = "texlive-extratools-2023.201-56.1.noarch.rpm"
RPM_HASH = "1972f1d1f17df0770961f1d39dc6e2af0759c8a93ed1f7d2db86c4a2204da12adf0dea9a6e34e234c2b1020be42620abec482784d916d50e785a1e0e0dc5cdf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extratools"
RDEPENDS:${PN} += "psutils texlive-dviasm texlive-dvidvi texlive-dvipng texlive-dvisvgm texlive-lacheck texlive-seetexk"

inherit rpm
