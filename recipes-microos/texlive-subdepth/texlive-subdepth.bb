SUMMARY = "Unify maths subscript height"
DESCRIPTION = "This package is based on code (posted long ago to comp.text.tex \
by Donald Arseneau) to equalise the height of subscripts in \
maths. The default behaviour is to place subscripts slightly \
lower when there is a superscript as well, but this can look \
odd in some situations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-subdepth-2023.201.0.0.1svn15878-57.1.noarch.rpm"
RPM_HASH = "61fbf64adef6967af0762e086f9f612437b505e2b9629db20cfb7c3fc55eab55c91bbface7b3bec832d7cca78883c2e10ee3d55a7bdef31b93a19cce52591ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(subdepth.sty) texlive-subdepth"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
