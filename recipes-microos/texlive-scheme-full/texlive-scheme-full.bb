SUMMARY = "Full scheme (everything)"
DESCRIPTION = "This is the full TeX Live scheme: it installs everything \
available."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-scheme-full-2023.201.svn54074-56.1.noarch.rpm"
RPM_HASH = "4bf782081b25db4b13c2a91dcd15115c9b55bc928d815d8bd628a0724099c646b45fe6f33f63431db8186f807393da2d36ac530ffd3114b437983e31c570c0c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-full"
RDEPENDS:${PN} += "texlive-collection-basic texlive-collection-bibtexextra texlive-collection-binextra texlive-collection-context texlive-collection-fontsextra texlive-collection-fontsrecommended texlive-collection-fontutils texlive-collection-formatsextra texlive-collection-games texlive-collection-humanities texlive-collection-langarabic texlive-collection-langchinese texlive-collection-langcjk texlive-collection-langcyrillic texlive-collection-langczechslovak texlive-collection-langenglish texlive-collection-langeuropean texlive-collection-langfrench texlive-collection-langgerman texlive-collection-langgreek texlive-collection-langitalian texlive-collection-langjapanese texlive-collection-langkorean texlive-collection-langother texlive-collection-langpolish texlive-collection-langportuguese texlive-collection-langspanish texlive-collection-latex texlive-collection-latexextra texlive-collection-latexrecommended texlive-collection-luatex texlive-collection-mathscience texlive-collection-metapost texlive-collection-music texlive-collection-pictures texlive-collection-plaingeneric texlive-collection-pstricks texlive-collection-publishers texlive-collection-xetex"

inherit rpm
