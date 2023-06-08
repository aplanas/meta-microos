SUMMARY = "'Encapsulate' MetaPost figures in a document"
DESCRIPTION = "Emp is a package for encapsulating MetaPost figures in LaTeX: \
the package provides environments where you can place MetaPost \
commands, and means of using that code as fragments for \
building up figures to include in your document. So, with emp, \
the procedure is to run your document with LaTeX, run MetaPost, \
and then complete running your document in the normal way. Emp \
is therefore useful for keeping illustrations in synchrony with \
the text. It also frees you from inventing descriptive names \
for PostScript files that fit into the confines of file system \
conventions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn23483"

RPM_NAME = "texlive-emp-2023.201.svn23483-53.1.noarch.rpm"
RPM_HASH = "06fe4cc16adf6ea9de08f326028c2cb5f829cb1719c5678bec719ba4b41e6676164ed741547a749152e6838389e36f60fc4f924b40828f93e33f7d9608b6ab11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(emp.sty) texlive-emp"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphics.sty) tex(verbatim.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
