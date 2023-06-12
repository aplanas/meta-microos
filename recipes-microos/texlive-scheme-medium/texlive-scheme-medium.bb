SUMMARY = "Medium scheme (small + more packages and languages)"
DESCRIPTION = "This is the medium TeX Live collection: it contains plain TeX, \
LaTeX, many recommended packages, and support for most European \
languages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-scheme-medium-2023.208.svn54074-58.1.noarch.rpm"
RPM_HASH = "948002a16f355d07b56db6d4fcdc51c5361dd19cf3003202b6b4f979250ebf6208123413e938625eed59b30fa57b6fefb26e914601a9733da926e13ca5f1a04b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-medium"
RDEPENDS:${PN} += "texlive-collection-basic \
texlive-collection-binextra \
texlive-collection-context \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-langczechslovak \
texlive-collection-langenglish \
texlive-collection-langeuropean \
texlive-collection-langfrench \
texlive-collection-langgerman \
texlive-collection-langitalian \
texlive-collection-langpolish \
texlive-collection-langportuguese \
texlive-collection-langspanish \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-luatex \
texlive-collection-mathscience \
texlive-collection-metapost \
texlive-collection-plaingeneric \
texlive-collection-xetex"

inherit rpm
