SUMMARY = "Medium scheme (small + more packages and languages)"
DESCRIPTION = "This is the medium TeX Live collection: it contains plain TeX, \
LaTeX, many recommended packages, and support for most European \
languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-scheme-medium-2023.201.svn54074-56.1.noarch.rpm"
RPM_HASH = "29be61c365dd755010abb58ea2739a1da44ef1b8433caef15403235c3dbaa9f06b9d9dc6880d2a4a315a9371055d2b170c548ffec6ba8b0fee532c73918af039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-medium"
RDEPENDS:${PN} += "texlive-collection-basic texlive-collection-binextra texlive-collection-context texlive-collection-fontsrecommended texlive-collection-fontutils texlive-collection-langczechslovak texlive-collection-langenglish texlive-collection-langeuropean texlive-collection-langfrench texlive-collection-langgerman texlive-collection-langitalian texlive-collection-langpolish texlive-collection-langportuguese texlive-collection-langspanish texlive-collection-latex texlive-collection-latexrecommended texlive-collection-luatex texlive-collection-mathscience texlive-collection-metapost texlive-collection-plaingeneric texlive-collection-xetex"

inherit rpm
