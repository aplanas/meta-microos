SUMMARY = "Plot data using PSTricks"
DESCRIPTION = "The package provides plotting of data (typically from external \
files), using PSTricks. Plots may be configured using a wide \
variety of parameters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.94svn65346"

RPM_NAME = "texlive-pst-plot-2023.201.1.94svn65346-53.1.noarch.rpm"
RPM_HASH = "3046aed98e0b69d310fa5d3f25de550c15e13a484adb9792d5078d241daf7b7f47f8c3810e72e41ca7ec3096d94400fd54672ba0a99e79f9801e9f29425cc7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-plot.sty) \
tex(pst-plot.tex) \
tex(pst-plot97.tex) \
texlive-pst-plot"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(multido.sty) \
tex(pst-xkey.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
