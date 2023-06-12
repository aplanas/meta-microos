SUMMARY = "Babel support for documents written in Lithuanian"
DESCRIPTION = "Babel support material for documents written in Lithuanian \
moved from the lithuanian package into a new package \
babel-lithuanian to match babel support for other languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn66513"

RPM_NAME = "texlive-babel-lithuanian-2023.201.1.0svn66513-53.1.noarch.rpm"
RPM_HASH = "b412588d142748ba73b54b7fd49b2a8974ee04f2b8d0cb8961d24ed60a471f02eee7484ed52d38bde10bd6c1ed9dc10042681b5e6a5b5e6dcdcdc90fb5f372ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lithuanian.ldf) \
texlive-babel-lithuanian"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
