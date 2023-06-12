SUMMARY = "To-do notes in a document"
DESCRIPTION = "The package provides to-do notes throughout a document, and \
will provide an index of things to do."
LICENSE = "Apache-1.0"

PV = "2023.201.svn32677"

RPM_NAME = "texlive-easy-todo-2023.201.svn32677-53.1.noarch.rpm"
RPM_HASH = "5b8a8613ac1c71cdeeb45a0a467c3abd01f004efb87151fd1e92b6ef969b9e16a74464c2d447940e49e2dbc10981756d6322492749885e6809bae9f37d2cf91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(easy-todo.sty) \
texlive-easy-todo"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(ifdraft.sty) \
tex(ifthen.sty) \
tex(tocloft.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
