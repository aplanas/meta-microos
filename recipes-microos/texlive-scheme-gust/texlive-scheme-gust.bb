SUMMARY = "GUST TeX Live scheme"
DESCRIPTION = "This is the GUST TeX Live scheme: it is a set of files \
sufficient to typeset Polish plain TeX, LaTeX and ConTeXt \
documents in PostScript or PDF."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59755"

RPM_NAME = "texlive-scheme-gust-2023.201.svn59755-56.1.noarch.rpm"
RPM_HASH = "714ac10c23142a8f93622ebb40c0dbc07cb98669477b497202cca629c07f7d64eb005dbd82fa16de40dd9b92357a98a768707a395bead36ebee1f01d3f97826f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-gust"
RDEPENDS:${PN} += "texlive-amslatex-primer texlive-amstex texlive-antt texlive-bibtex8 texlive-collection-basic texlive-collection-context texlive-collection-fontsrecommended texlive-collection-fontutils texlive-collection-langpolish texlive-collection-latex texlive-collection-latexrecommended texlive-collection-metapost texlive-collection-plaingeneric texlive-collection-xetex texlive-comment texlive-comprehensive texlive-concrete texlive-cyklop texlive-dvidvi texlive-dviljk texlive-fontinstallationguide texlive-gustprog texlive-impatient texlive-iwona texlive-metafont-beginners texlive-metapost-examples texlive-poltawski texlive-seetexk texlive-seminar texlive-tds texlive-tex4ht texlive-texdoc"

inherit rpm
