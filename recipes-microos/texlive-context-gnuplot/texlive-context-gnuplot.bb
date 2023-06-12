SUMMARY = "Inclusion of Gnuplot graphs in ConTeXt"
DESCRIPTION = "Enables simple creation and inclusion of graphs with Gnuplot. \
The package writes a script into temporary file, runs Gnuplot \
and includes the resulting graphic directly into the document. \
See the ConTeXt Garden package page for further details."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-gnuplot-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "8eec8a6058c328c292b5760c3ab8b47e76fe84e607e12c715a0b41e6b67c31805255d168d35bee575ceb239a0bea4fae9be25bc688707af6e3ee137a5bdd078e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-gnuplot"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
