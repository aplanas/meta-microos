SUMMARY = "Full scheme (everything)"
DESCRIPTION = "This is the full TeX Live scheme: it installs everything \
available."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-scheme-full-2023.208.svn54074-58.1.noarch.rpm"
RPM_HASH = "e456b3b8d189506680950616a6803b9cc1f6943f5b21d3f2569da7830a6e79dd394cad23bc4acebd9be25464355186892ac356b3359e8416300dde0c06d62930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-full"
RDEPENDS:${PN} += "texlive-collection-basic \
texlive-collection-bibtexextra \
texlive-collection-binextra \
texlive-collection-context \
texlive-collection-fontsextra \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-formatsextra \
texlive-collection-games \
texlive-collection-humanities \
texlive-collection-langarabic \
texlive-collection-langchinese \
texlive-collection-langcjk \
texlive-collection-langcyrillic \
texlive-collection-langczechslovak \
texlive-collection-langenglish \
texlive-collection-langeuropean \
texlive-collection-langfrench \
texlive-collection-langgerman \
texlive-collection-langgreek \
texlive-collection-langitalian \
texlive-collection-langjapanese \
texlive-collection-langkorean \
texlive-collection-langother \
texlive-collection-langpolish \
texlive-collection-langportuguese \
texlive-collection-langspanish \
texlive-collection-latex \
texlive-collection-latexextra \
texlive-collection-latexrecommended \
texlive-collection-luatex \
texlive-collection-mathscience \
texlive-collection-metapost \
texlive-collection-music \
texlive-collection-pictures \
texlive-collection-plaingeneric \
texlive-collection-pstricks \
texlive-collection-publishers \
texlive-collection-xetex"

inherit rpm
