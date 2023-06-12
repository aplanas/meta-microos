SUMMARY = "TeTeX scheme (more than medium, but nowhere near full)"
DESCRIPTION = "TeX Live scheme nearly equivalent to the teTeX distribution \
that was maintained by Thomas Esser."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59715"

RPM_NAME = "texlive-scheme-tetex-2023.208.svn59715-58.1.noarch.rpm"
RPM_HASH = "88ba916fe8126829c5cc7ec1798d67814d02848a208f9dddf42fd426325a4f63b2ec3356c90090124d8580e05be80a32190d9a857b5fde4e7a962d7d804dcce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tetex) texlive-scheme-tetex"
RDEPENDS:${PN} += "texlive-acronym texlive-amslatex-primer texlive-bbm texlive-bbm-macros texlive-bbold texlive-bibtex8 texlive-cmbright texlive-collection-basic texlive-collection-context texlive-collection-fontsrecommended texlive-collection-fontutils texlive-collection-formatsextra texlive-collection-langcjk texlive-collection-langcyrillic texlive-collection-langczechslovak texlive-collection-langenglish texlive-collection-langeuropean texlive-collection-langfrench texlive-collection-langgerman texlive-collection-langgreek texlive-collection-langitalian texlive-collection-langother texlive-collection-langpolish texlive-collection-langportuguese texlive-collection-langspanish texlive-collection-latex texlive-collection-latexrecommended texlive-collection-mathscience texlive-collection-metapost texlive-collection-pictures texlive-collection-plaingeneric texlive-collection-pstricks texlive-ctie texlive-cweb texlive-detex texlive-dtl texlive-dvicopy texlive-dvidvi texlive-dviljk texlive-eplain texlive-eulervm texlive-gentle texlive-lshort-english texlive-mltex texlive-multirow texlive-nomencl texlive-patgen texlive-pst-pdf texlive-rsfs texlive-seetexk texlive-siunits texlive-subfigure texlive-supertabular texlive-tamethebeast texlive-tds texlive-tex-refs texlive-tie texlive-web texlive-xpdfopen"

inherit rpm
