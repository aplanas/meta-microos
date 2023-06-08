SUMMARY = "A font to typeset the Philokalia Books"
DESCRIPTION = "The philokalia package has been designed to ease the use of the \
Philokalia-Regular OpenType font with XeLaTeX. The font started \
as a project to digitize the typeface used to typeset the \
Philokalia books."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn45356"

RPM_NAME = "texlive-philokalia-2023.201.1.2svn45356-51.1.noarch.rpm"
RPM_HASH = "c583cc8120ab3ecd2a63940b168a72a68cc18a9ca43691f58a3b1bd872131c3e33fac34ad6a736bb1089d57f17336f7b4230ad49890e361a77799e0a21486520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(philokalia.sty) tex(tuplk.fd) texlive-philokalia"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(lettrine.sty) tex(xltxtra.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-philokalia-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
