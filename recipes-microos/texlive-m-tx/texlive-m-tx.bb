SUMMARY = "A preprocessor for pmx"
DESCRIPTION = "M-Tx is a preprocessor to pmx, which is itself a preprocessor \
to musixtex, a music typesetting system. The prime motivation \
to the development of M-Tx was to provide lyrics for music to \
be typeset. In fact, pmx now provides a lyrics interface, but \
M-Tx continues in use by those who prefer its language."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.63dsvn64182"

RPM_NAME = "texlive-m-tx-2023.201.0.0.63dsvn64182-52.1.noarch.rpm"
RPM_HASH = "d3e987142a154bd4f74b5d3554372d5e317eb97d43da6f479a2e2546300a32891e9e8e9eb7a884f197db66115fef169a798d2393193ae7c19d4b813e4f5f0c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mtx.tex) \
tex(mtxlatex.sty) \
texlive-m-tx"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex(etex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-m-tx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
