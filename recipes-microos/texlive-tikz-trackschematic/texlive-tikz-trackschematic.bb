SUMMARY = "A TikZ library for creating track diagrams in railways"
DESCRIPTION = "This TikZ library is a toolbox of symbols geared primarily \
towards creating track schematic for either research or \
educational purposes. It provides a TikZ frontend to some of \
the symbols which may be needed to describe situations and \
layouts in railway operation. The library is divided into \
sublibraries: topology, trafficcontrol, vehicles, \
constructions, electrics, symbology, and measures."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.1svn63480"

RPM_NAME = "texlive-tikz-trackschematic-2023.201.0.0.7.1svn63480-52.1.noarch.rpm"
RPM_HASH = "f9b6867b037e17d74f9c2cf1c71c2257ca999e92a59a16d8c7d6713747f4b0d790499836aa8b15ae2708847342017de4e3b7bf83d75e11add316b68ca95d197d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-trackschematic.sty) \
tex(tikzlibrarytrackschematic.code.tex) \
tex(tikzlibrarytrackschematic.constructions.code.tex) \
tex(tikzlibrarytrackschematic.electrics.code.tex) \
tex(tikzlibrarytrackschematic.measures.code.tex) \
tex(tikzlibrarytrackschematic.symbology.code.tex) \
tex(tikzlibrarytrackschematic.topology.code.tex) \
tex(tikzlibrarytrackschematic.trafficcontrol.code.tex) \
tex(tikzlibrarytrackschematic.vehicles.code.tex) \
texlive-tikz-trackschematic"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
