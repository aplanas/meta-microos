SUMMARY = "GUST TeX Live scheme"
DESCRIPTION = "This is the GUST TeX Live scheme: it is a set of files \
sufficient to typeset Polish plain TeX, LaTeX and ConTeXt \
documents in PostScript or PDF."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59755"

RPM_NAME = "texlive-scheme-gust-2023.208.svn59755-58.1.noarch.rpm"
RPM_HASH = "fc9c5bca7c696773ef89f997391253577a3fada99cb3ea2874f8685a2815159c338abd4d23dabfe17d311dd794a95860fd1d6b4ff925c3c9389db45d5f6a84bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-gust"
RDEPENDS:${PN} += "texlive-amslatex-primer \
texlive-amstex \
texlive-antt \
texlive-bibtex8 \
texlive-collection-basic \
texlive-collection-context \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-langpolish \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-metapost \
texlive-collection-plaingeneric \
texlive-collection-xetex \
texlive-comment \
texlive-comprehensive \
texlive-concrete \
texlive-cyklop \
texlive-dvidvi \
texlive-dviljk \
texlive-fontinstallationguide \
texlive-gustprog \
texlive-impatient \
texlive-iwona \
texlive-metafont-beginners \
texlive-metapost-examples \
texlive-poltawski \
texlive-seetexk \
texlive-seminar \
texlive-tds \
texlive-tex4ht \
texlive-texdoc"

inherit rpm
