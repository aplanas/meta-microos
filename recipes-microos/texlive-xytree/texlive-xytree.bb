SUMMARY = "Tree macros using XY-Pic"
DESCRIPTION = "The package provides means to draw linguistic syntactic trees \
with ease and to support hopefully sufficient functionalities, \
that the linguist may need. The package (of course) depends on \
the XY-Pic package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-xytree-2023.201.1.5svn15878-52.1.noarch.rpm"
RPM_HASH = "e18b306ce7bd4191a3c5d738ef9bf26b808047b55ef9eb65c5e6896dc55f1ff79564fb1d2aac7c76342bb3d81f6c5cb2b503eb8de5d7990b4750a3fc5e70db96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xytree.sty) \
texlive-xytree"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xy.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
