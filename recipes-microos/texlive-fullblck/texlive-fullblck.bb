SUMMARY = "Left-blocking for letter class"
DESCRIPTION = "Used with the letter documentclass to set the letter in a \
fullblock style (everything at the left margin)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn25434"

RPM_NAME = "texlive-fullblck-2023.201.1.03svn25434-52.1.noarch.rpm"
RPM_HASH = "159a0e4bd0dc4235dcdf181d61eb3e471dd7139a326ff29425279d8ae1a3d7c90bba510a667020fcec85c1c243808363a65a35d884a68859fd1455124316426d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fullblck.sty) \
texlive-fullblck"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
