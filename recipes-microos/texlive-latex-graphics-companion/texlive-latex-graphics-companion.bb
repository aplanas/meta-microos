SUMMARY = "Examples from The LaTeX Graphics Companion"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29235"

RPM_NAME = "texlive-latex-graphics-companion-2023.201.svn29235-55.1.noarch.rpm"
RPM_HASH = "57a9713f057ecb00b5ea7c288798b32658abddb423d5c2ee1fffae653689d20745dc0c6f0de7eff77553ede238a05b835124bb7882859e60eaf02e5f78d87aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-graphics-companion"
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
