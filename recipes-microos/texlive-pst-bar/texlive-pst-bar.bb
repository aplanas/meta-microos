SUMMARY = "Produces bar charts using PSTricks"
DESCRIPTION = "The package uses pstricks to draw bar charts from data stored \
in a comma-delimited file. Several types of bar charts may be \
drawn, and the drawing parameters are highly customizable. No \
external packages are required except those that are part of \
the standard PSTricks distribution."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.93svn64331"

RPM_NAME = "texlive-pst-bar-2023.201.0.0.93svn64331-52.1.noarch.rpm"
RPM_HASH = "e966288339e449ca006a5bb1f5c6404716e5dfffe8d844c3c3bf6b534d3433115f982c67f2ac9a7aeeb783804d0b4117777366e7afe388190a33357c677cc355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-bar.sty) tex(pst-bar.tex) texlive-pst-bar"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
