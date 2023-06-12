SUMMARY = "PSTricks support functions"
DESCRIPTION = "The package provides helper functions for other PSTricks \
related packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-2023.201.0.0.12svn60621-53.1.noarch.rpm"
RPM_HASH = "7f659d7820c68d5f7d98eccadcec87466843df4c533e1630bb8250942d807552d2ce8625f52784776e1f1b9765763b75eac28614888a68c8815ad36c95162e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-tools.sty) \
tex(pst-tools.tex) \
texlive-pst-tools"
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
