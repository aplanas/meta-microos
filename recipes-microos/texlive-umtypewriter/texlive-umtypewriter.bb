SUMMARY = "Fonts to typeset with the xgreek package"
DESCRIPTION = "The UMTypewriter font family is a monospaced font family that \
was built from glyphs from the CB Greek fonts, the CyrTUG \
Cyrillic alphabet fonts ('LH'), and the standard Computer \
Modern font family. It contains four OpenType fonts which are \
required for use of the xgreek package for XeLaTeX."
LICENSE = "OFL-1.1"

PV = "2023.201.1.1svn64443"

RPM_NAME = "texlive-umtypewriter-2023.201.1.1svn64443-53.1.noarch.rpm"
RPM_HASH = "2bd68c2580cf48ce0df3d14bba1a906fed6e077a3cccad147094f095bf5d7551afb2805801b322db7e8ff2f671d9d00165882fa2a8572a165adafe93782047a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umtypewriter"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-umtypewriter-fonts"

inherit rpm
