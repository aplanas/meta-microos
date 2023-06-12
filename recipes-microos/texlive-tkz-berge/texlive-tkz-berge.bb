SUMMARY = "Macros for drawing graphs of graph theory"
DESCRIPTION = "The package provides a collection of useful macros for drawing \
classic graphs of graph theory, or to make other graphs. This \
package has been taken temporarily out of circulation to give \
the author time to investigate some problems."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn57485"

RPM_NAME = "texlive-tkz-berge-2023.201.2.0svn57485-52.1.noarch.rpm"
RPM_HASH = "26b0c99100bc044a1eb1a742dc27f0824f7503c7ab05a988fc73d1cde2edf00cd1da616bfc741ea266d8a3142790330ce370a79c6833cba364077b0566f7ad35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tkz-berge.sty) \
texlive-tkz-berge"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tkz-graph.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
