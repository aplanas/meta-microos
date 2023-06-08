SUMMARY = "A simple bibliography processor"
DESCRIPTION = "The package is described by its author as 'a poor person's \
replacement for the more powerful methods provided by BibLaTeX \
to access data from a .bib file'. Its principle commands are \
\\bibinput (which specifies a database to use) and \\usebibdata \
(which typesets a single field from a specified entry in that \
database."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn25969"

RPM_NAME = "texlive-usebib-2023.201.1.0asvn25969-53.1.noarch.rpm"
RPM_HASH = "56c525087b0b8555a0a22e855fe14f59578476e5609cc170c6a4f0cb08a9cc286011ac1e2db79ff3747010febcaf321c19dee4b03533877299e6e7d5ac4dbfcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(usebib.sty) texlive-usebib"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
