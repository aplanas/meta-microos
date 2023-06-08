SUMMARY = "Extensions to epic and the LaTeX drawing tools"
DESCRIPTION = "Extensions to epic and the LaTeX picture drawing environment, \
include the drawing of lines at any slope, the drawing of \
circles in any radii, and the drawing of dotted and dashed \
lines much faster with much less TeX memory, and providing \
several new commands for drawing ellipses, arcs, splines, and \
filled circles and ellipses. The package uses tpic \\special \
commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1esvn15878"

RPM_NAME = "texlive-eepic-2023.201.1.1esvn15878-53.1.noarch.rpm"
RPM_HASH = "c31a852dcffa6d48ecdaaedd8d91c45dbf3c26821734505223489eca905035000cd5463f180ba52a9cff6cc46e174eae2a04fb42a58c3d58f65e563d705ebfe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eepic.sty) tex(eepicemu.sty) tex(epic.sty) texlive-eepic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
