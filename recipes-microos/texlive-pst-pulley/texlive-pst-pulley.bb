SUMMARY = "Plot pulleys, using PSTricks"
DESCRIPTION = "The package enables the user to draw pulley systems with up to \
6 pulleys. The pulley diagrams are labelled with the physical \
properties of the system. The package uses pstricks and \
requires several PSTricks-related packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-2023.201.0.0.02svn62977-53.1.noarch.rpm"
RPM_HASH = "0a252b5ee603c7f556297da63e3c4e7a9e2114c20e4638c1223cd14c081e2efbfd4c1239e2af23438d0a66ef318103ae48670a6ec54338debfee0beac831cdcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-pulley.sty) tex(pst-pulley.tex) texlive-pst-pulley"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
