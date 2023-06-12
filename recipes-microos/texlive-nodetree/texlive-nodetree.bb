SUMMARY = "Visualize node lists in a tree view"
DESCRIPTION = "nodetree is a development package that visualizes the structure \
of node lists. nodetree shows its debug informations in the \
console output when you compile a LuaTeX file. It uses a \
similar visual representation for node lists as the UNIX tree \
command for a folder structure."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn65298"

RPM_NAME = "texlive-nodetree-2023.201.2.2.1svn65298-54.1.noarch.rpm"
RPM_HASH = "51ef42aaf453b3b2467b57d8bed3c4e8891b60d1d341edf2f6303690c5545714dcabbe540721d929621894895eb715aafef09e5d38a0450741e7612fb13cf1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nodetree-embed.sty) \
tex(nodetree.sty) \
tex(nodetree.tex) \
texlive-nodetree"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(fontspec.sty) \
tex(kvoptions.sty) \
tex(mdframed.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
