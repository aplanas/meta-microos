SUMMARY = "Store statistics of a document"
DESCRIPTION = "The package counts the numbers of pages per chapter, and stores \
the results in a separate file; the format of the file is \
selectable."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.03svn20334"

RPM_NAME = "texlive-statistik-2023.201.0.0.03svn20334-57.1.noarch.rpm"
RPM_HASH = "0059af7f7ecaabeb3bd6c179b722c6a03d45c821d21773493d9e1b39110f60137def979de9219f335c191189fb2d811a6a2b5185c67be614a8f1dfaa2936cc3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(statistik.sty) \
texlive-statistik"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
