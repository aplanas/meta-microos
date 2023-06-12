SUMMARY = "'Traditional' BibTeX styles with BibLaTeX"
DESCRIPTION = "The bundle provides implementations of the 'traditional' BibTeX \
styles (plain, abbrev, unsrt and alpha) with BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn58169"

RPM_NAME = "texlive-biblatex-trad-2023.201.0.0.5svn58169-53.1.noarch.rpm"
RPM_HASH = "8bc70fe91c6358e482fda80b2984196bdbf7d85f948a1f7d120dd12cea33b5f59c009036bb950d687ff3471969b790d465333388ce7eb5615a07aa29bcfb529b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(trad-abbrv.bbx) \
tex(trad-abbrv.cbx) \
tex(trad-alpha.bbx) \
tex(trad-alpha.cbx) \
tex(trad-plain.bbx) \
tex(trad-plain.cbx) \
tex(trad-standard.bbx) \
tex(trad-standard.cbx) \
tex(trad-unsrt.bbx) \
tex(trad-unsrt.cbx) \
texlive-biblatex-trad"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphabetic.cbx) \
tex(numeric.cbx) \
tex(standard.bbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
