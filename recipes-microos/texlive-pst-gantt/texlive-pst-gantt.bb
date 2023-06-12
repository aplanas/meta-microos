SUMMARY = "Draw GANTT charts with PSTricks"
DESCRIPTION = "The package uses PSTricks to draw GANTT charts, which are a \
kind of bar chart that displays a project schedule. The package \
requires the pstricks apparatus, of course."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.22asvn35832"

RPM_NAME = "texlive-pst-gantt-2023.201.0.0.22asvn35832-52.1.noarch.rpm"
RPM_HASH = "5bf4cd5a371e222bc66ab1aca29748a6a3c96cdaab4821a3d0559fc7502aa87ff1ed82b4f7fc21b7a58be8f2493a5a6dcfeb39730d8fe7a96800ad13dce68afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-gantt.sty) \
tex(pst-gantt.tex) \
texlive-pst-gantt"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
