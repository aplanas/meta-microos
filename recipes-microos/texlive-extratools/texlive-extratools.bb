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

PV = "2023.208"

RPM_NAME = "texlive-extratools-2023.208-58.1.noarch.rpm"
RPM_HASH = "f84a9b4500c3122122839126806d0ce7bdb85b4c2f8fcdef56dc118e58aee8d42d2f75e51aca05942e7f70a15e0bd2a90681ead87ba23d5814dfcc420a8ad3c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extratools"
RDEPENDS:${PN} += "psutils texlive-dviasm texlive-dvidvi texlive-dvipng texlive-dvisvgm texlive-lacheck texlive-seetexk"

inherit rpm
