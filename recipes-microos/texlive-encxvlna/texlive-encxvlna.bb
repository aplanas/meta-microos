SUMMARY = "Insert nonbreakable spaces, using encTeX"
DESCRIPTION = "The package provides tools for inserting nonbreakable spaces \
after nonsyllabic prepositions and single letter conjunctions \
as required by Czech and Slovak typographical rules. It is \
implemented using encTeX and provides files both for plain TeX \
and LaTeX. The LaTeX solution tries to avoid conflicts with \
other packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34087"

RPM_NAME = "texlive-encxvlna-2023.201.1.1svn34087-53.1.noarch.rpm"
RPM_HASH = "51c6806912272b8a3d1db8719b55d263bfbe46742a51801b37b03def5975f1a8a201c88dd3ed5e79bdd57a457cf4e67165018211cc4b73f773e93c294eabe91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(encxvlna.sty) tex(encxvlna.tex) texlive-encxvlna"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
