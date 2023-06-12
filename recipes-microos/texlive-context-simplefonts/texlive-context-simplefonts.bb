SUMMARY = "Simplified font usage for ConTeXt"
DESCRIPTION = "The package defines a set of commands for loading and using \
fonts in ConTeXt."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-simplefonts-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "f512128557411a9d8c16021f1a91dd3e63e01d52e7b3d86e3c9b6c7385e5f63c71f4d3e7f578b223aba3d1403a7af9024b0334715528a25b91689ac1a8dae988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-simplefonts"
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
