SUMMARY = "Typeset musical pitches with octave designations"
DESCRIPTION = "This package package typesets musical pitch names with \
designation for the octave in either the Helmholtz system (with \
octave numbers), or the traditional system (with prime \
symbols). Authors can just write \\pitch{C}{4} and the pitches \
will be rendered correctly depending on which package option \
was selected. The system can also be changed mid-document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-octave-2023.201.svn66115-54.1.noarch.rpm"
RPM_HASH = "a2db0e0f572079b0d6ed57e47659906b078ab1eee0561651a0bfe3d494b605100fafad4f97a7b61c8d3f436fb2954797a2adae9984e6c4e4842c3900bca25824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(octave.sty) \
texlive-octave"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
