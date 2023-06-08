SUMMARY = "Include multiple bibliographies in a document"
DESCRIPTION = "The package allows the user to include several bibliographies \
covering different 'topics' or bibliographic material into a \
document (e.g., one bibliography for primary literature and one \
for secondary literature). The package provides commands to \
include either all references from a .bib file, only the \
references actually cited or those not cited in your document. \
The user has to construct a separate .bib file for each \
bibliographic 'topic', each of which will be processed \
separately by BibTeX. If you want to have bibliographies \
specific to one part of a document, see the packages bibunits \
or chapterbib."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-bibtopic-2023.201.1.1asvn15878-53.1.noarch.rpm"
RPM_HASH = "b64abdc1229c04604189ea8e9952e8920e4affa52f07b5b6c5200972922fa5fdea13d47989331bca746e559b19f8456dd0d74d8f8356941a38ea3621ef5b0e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bibtopic.sty) texlive-bibtopic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
