SUMMARY = "Overfull pages with ConTeXt"
DESCRIPTION = "The (ConTeXt) module copies the functionality of the fullpage, \
and adds a styling parameter, given in the \\usemodule command"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-fullpage-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "132156dbbdfe297637d10ae77489cb3cd80e535c6dad85df52b94dd8f96c07711c924ea932d4378791f881d436377a74d4edb78a79da8ad205076eb141d4dc07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-fullpage"
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
