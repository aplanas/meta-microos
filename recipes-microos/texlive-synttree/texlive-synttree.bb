SUMMARY = "Typeset syntactic trees"
DESCRIPTION = "A package to typeset syntactic trees such as those used in \
Chomsky's Generative grammar, based on a description of the \
structure of the tree."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.2svn16252"

RPM_NAME = "texlive-synttree-2023.201.1.4.2svn16252-57.1.noarch.rpm"
RPM_HASH = "b3afdb954c06add1a8fde9cc16788450331330589a54b2269ec9b1f05d117f23fcc04a817eddc9a8e85a7f15e7cb150354a780753655f5f29b6e902798e1ec95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(synttree.sty) \
texlive-synttree"
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
