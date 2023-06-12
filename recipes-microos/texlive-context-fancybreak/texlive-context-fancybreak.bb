SUMMARY = "Overfull pages with ConTeXt"
DESCRIPTION = "The (ConTeXt) module allows insertion of thought breaks in \
texts. With parameters one can adjust the spacing around the \
content and set a default symbol."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-fancybreak-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "db5917a61334d92445cea34388df1286c332c408319f19901e31b7b47545b6b2535513f8c4d44d7f853d8c4941e805443a76f75bc7036e59c667417edab75ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-fancybreak"
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
