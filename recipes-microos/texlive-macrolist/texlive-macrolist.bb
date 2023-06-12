SUMMARY = "List operations for LaTeX2e"
DESCRIPTION = "This package provides a list data structure and common list \
functions such as \\macrolistadd, \\macrolistremove, \
\\macrolistforeach, as well as \\macrolistremovelast (similar to \
C++'s pop_back) and \\macrolistjoin (similar to Javascript's \
arr.join). Unlike most programming languages, the lists in this \
package are 1-indexed, meaning the first element is numbered 1, \
the second element numbered 2, and so on."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn60139"

RPM_NAME = "texlive-macrolist-2023.201.2.1.0svn60139-52.1.noarch.rpm"
RPM_HASH = "2087fea393d0aace5aeb85bf9e6adf72cdf242e68ea98e118dbf57c8e14f93968281a28702055a47171b64d42c540ef98956932d1722ee0217c2a14151844b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(macrolist.sty) \
texlive-macrolist"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgffor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
