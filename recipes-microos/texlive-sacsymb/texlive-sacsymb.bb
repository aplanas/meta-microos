SUMMARY = "'Sacred Symbols' prepared with TikZ"
DESCRIPTION = "The author tells us: This is 'a package with symbols prepared \
with TikZ. These symbols are the variables used in the space of \
the collapse of the wave function of a quantum field associated \
with the micro-tubule while exploring an Orchestrated, \
objective reduction (Orch OR) theory of consciousness as \
applied to the three brains model of psychological experience.'"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65768"

RPM_NAME = "texlive-sacsymb-2023.201.svn65768-53.1.noarch.rpm"
RPM_HASH = "c2eedf01037e728e5fb4410541ad2ed4a9831d1e322054070a8e223eab6f06bbaf68e02df2fe938dc850876b704c9c385197b483174b5a1e18d8157b5907d6dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sacsymb.sty) texlive-sacsymb"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
