SUMMARY = "Creation of syntax diagrams"
DESCRIPTION = "Create syntax diagrams using special environments and commands \
to represent the diagram structure."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-syntax-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "2d97568251039bc039af72c92e9ee96bf73c9cc1688955e605b73da9cd31ee06cbcd73e4d9034348e5cce4a75048a880e39c7a865a85e2926bc91df694471378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(syntax.tex) \
texlive-syntax"
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
