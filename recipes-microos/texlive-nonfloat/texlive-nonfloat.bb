SUMMARY = "Non-floating table and figure captions"
DESCRIPTION = "Adjusts the figure and table environments to ensure that \
centered objects as one line captions are centered as well. \
Also the vertical spaces for table captions above the table are \
changed."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn17598"

RPM_NAME = "texlive-nonfloat-2023.201.1.0svn17598-54.1.noarch.rpm"
RPM_HASH = "e1d4f40d1f2b4911a8ff386bd877ae9b5de6893ebb9e28c669d2ab3cd6444571e3c4b08e4da94ff2726edbcc7f5b6bd1ed44f87978ad7ddf063700dc345287ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nonfloat.sty) \
texlive-nonfloat"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
