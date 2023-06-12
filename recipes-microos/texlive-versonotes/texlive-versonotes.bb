SUMMARY = "Display brief notes on verso pages"
DESCRIPTION = "This package allows you to place notes on the verso pages of an \
otherwise single-sided document. If, in the run of text, you \
include a call to the macro \\versonote{This is a remark}, then \
that text will be placed on the opposite (ie, 'verso') page, \
lined up with the macro call."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn55777"

RPM_NAME = "texlive-versonotes-2023.201.0.0.4svn55777-53.1.noarch.rpm"
RPM_HASH = "4f202897d6f090638fa1e798a671c5a3fcee9957b84e5413c54dda6649bd108f0a80c7c2ca42e651de5d2e4c3b9dfcf2b65ee406d83a9c777ecabba1380bbd3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(versonotes.sty) \
texlive-versonotes"
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
