SUMMARY = "Make a to-do list for a document"
DESCRIPTION = "The package allows you to insert 'to do' marks in your \
document, to make lists of such items, and to cross-reference \
to them."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.142svn17746"

RPM_NAME = "texlive-todo-2023.201.2.142svn17746-52.1.noarch.rpm"
RPM_HASH = "7eb36e38f6d79a80dfcd8f05e166124a68efec4e1002d6421dbd515437240d5e7d4389cfbcec592645255bb914014d7a5377c87c6ec8a31feb8f9f93a79ac027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(todo.sty) \
texlive-todo"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
