SUMMARY = "A little fun package for using rubber ducks in TikZ"
DESCRIPTION = "The package is a LaTeX package for ducks to be used in TikZ \
pictures. This project is a continuation of an answer at \
StackExchange How we can draw a duck?"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn55713"

RPM_NAME = "texlive-tikzducks-2023.201.1.5svn55713-52.1.noarch.rpm"
RPM_HASH = "013f99e007ec2ef959a5ceefc60697ed1800f57cc7841e1de3e12ba42bc51c04080c9f5f2c02c97eadb8f79b28e5323f8325deebbb6a9d8e1077348de70014c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzducks-generic.tex) \
tex(tikzducks.sty) \
tex(tikzlibraryducks.code.tex) \
texlive-tikzducks"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
