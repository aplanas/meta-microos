SUMMARY = "Support DVI pos: specials used by ConTeXt DVI output"
DESCRIPTION = "The dvipos package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-dvipos-2023.201.svn66186-53.1.noarch.rpm"
RPM_HASH = "502300eb0a78a67e5444aecb5281855c8915d2e590e45a8e703eba330063117390ce058511f96febe5ffdbc84a08c2241d585246271ed1a6eee3f966575d80ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dvipos.1) \
texlive-dvipos"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvipos-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
