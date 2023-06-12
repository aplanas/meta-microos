SUMMARY = "C90 font encoding for Thai"
DESCRIPTION = "part of the CJK package, ctan.org/pkg/cjk"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60830"

RPM_NAME = "texlive-c90-2023.201.svn60830-52.1.noarch.rpm"
RPM_HASH = "240ce4832558514e3c6bca8546f648d6690fa68881e0f447d4bc223ca895f68477006a9613934b72b0c971e124c81ee44991a622c5fb975524d839f6108e46d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(c90.enc) \
texlive-c90"
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
