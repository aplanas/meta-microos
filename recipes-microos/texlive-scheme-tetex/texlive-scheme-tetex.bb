SUMMARY = "TeTeX scheme (more than medium, but nowhere near full)"
DESCRIPTION = "TeX Live scheme nearly equivalent to the teTeX distribution \
that was maintained by Thomas Esser."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59715"

RPM_NAME = "texlive-scheme-tetex-2023.201.svn59715-56.1.noarch.rpm"
RPM_HASH = "59b507a438515076084ec3730dd9dcc30b0ad8b0eaf5446916d054d3e8e4635232a5ba5b675345879e939b80e30f7a41d53ac21e9165ac99a0be8f62c7b1d666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tetex) texlive-scheme-tetex"
RDEPENDS:${PN} += "texlive-acronym texlive-amslatex-primer texlive-bbm texlive-bbm-macros texlive-bbold texlive-bibtex8 texlive-cmbright texlive-collection-basic texlive-collection-context texlive-collection-fontsrecommended texlive-collection-fontutils texlive-collection-formatsextra texlive-collection-langcjk texlive-collection-langcyrillic texlive-collection-langczechslovak texlive-collection-langenglish texlive-collection-langeuropean texlive-collection-langfrench texlive-collection-langgerman texlive-collection-langgreek texlive-collection-langitalian texlive-collection-langother texlive-collection-langpolish texlive-collection-langportuguese texlive-collection-langspanish texlive-collection-latex texlive-collection-latexrecommended texlive-collection-mathscience texlive-collection-metapost texlive-collection-pictures texlive-collection-plaingeneric texlive-collection-pstricks texlive-ctie texlive-cweb texlive-detex texlive-dtl texlive-dvicopy texlive-dvidvi texlive-dviljk texlive-eplain texlive-eulervm texlive-gentle texlive-lshort-english texlive-mltex texlive-multirow texlive-nomencl texlive-patgen texlive-pst-pdf texlive-rsfs texlive-seetexk texlive-siunits texlive-subfigure texlive-supertabular texlive-tamethebeast texlive-tds texlive-tex-refs texlive-tie texlive-web texlive-xpdfopen"

inherit rpm
