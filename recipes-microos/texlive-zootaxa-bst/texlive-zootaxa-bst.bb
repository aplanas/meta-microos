SUMMARY = "A BibTeX style for the journal Zootaxa"
DESCRIPTION = "This package provides a .bst reference style file for the \
journal Zootaxa that publishes contributions in zoology and \
classification. This is a fork of apa.bst as provided by TeX \
Live since this style file resembled the most Zootaxa's own \
style. Further modifications were made to the code in order to \
generate in-text citations and bibliography sections \
appropriately."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50619"

RPM_NAME = "texlive-zootaxa-bst-2023.201.1.0svn50619-52.1.noarch.rpm"
RPM_HASH = "7cb55e607301fc1da099c48976d2a2ce91e80246802c81514dfcd6cab126bf86c3d4dbce4b606f9c4008e225ee63cdce64da4947a0fa8e2ef1b421cbf6adcd8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
