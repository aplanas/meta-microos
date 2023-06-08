SUMMARY = "Platonic solids in PSTricks"
DESCRIPTION = "The package adds to PSTricks the ability to draw 3-dimensional \
views of the five Platonic solids."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-2023.201.0.0.01svn16538-53.1.noarch.rpm"
RPM_HASH = "da90d3954d3ee02b9dec764e8b9261f2a5d1a3aa517816432d756d115f3c6e3a0cc2a172b08782ecf0f8e3dbac283b8f945117286f1691068b01c8bb9f1488bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-platon.sty) texlive-pst-platon"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pst-3d.sty) tex(pst-xkey.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
