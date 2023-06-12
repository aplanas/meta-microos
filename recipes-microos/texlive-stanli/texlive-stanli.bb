SUMMARY = "TikZ Library for Structural Analysis"
DESCRIPTION = "stanli is a STructural ANalysis LIbrary based on PGF/TikZ. \
Creating new assignments and tests, at university, is usually a \
very time-consuming task, especially when this includes drawing \
graphics. In the field of structural engineering, those small \
structures are a key part for teaching. This package permits to \
create such 2D and 3D structures in a very fast and simple way."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.0svn54512"

RPM_NAME = "texlive-stanli-2023.201.3.0svn54512-57.1.noarch.rpm"
RPM_HASH = "6be1f9b598424fd3a6978a884d45506f8ecccbbb6ed846ec78d45b93b02bfd4e9a56ac25d7461294b5c9ad206c9fcf2d8d679d64ca7223653fcec118796324e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(stanli.sty) \
texlive-stanli"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
tex(verbatim.sty) \
tex(xargs.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
