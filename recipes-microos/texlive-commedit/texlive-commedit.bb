SUMMARY = "Commented editions with LaTeX"
DESCRIPTION = "The package is intended for commented editions. An example of \
commented edition is a teacher's book based on a student's \
textbook. Each page of a teacher's book is a page from the \
textbook and comments for the teacher. This package was \
commissioned by Instituto de Matematica Pura e Aplicada ( IMPA)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn50116"

RPM_NAME = "texlive-commedit-2023.201.1.02svn50116-53.1.noarch.rpm"
RPM_HASH = "5240175b838ad9411cff0c47756cd1b2c97a51d4ac2546660748873a8f472b2c785cdc4a9312d5bc0295ecb9a3f144971dd8fffd4b9166da86f285d0c1b9f907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(commedit.sty) \
texlive-commedit"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(changepage.sty) \
tex(etoolbox.sty) \
tex(everyshi.sty) \
tex(graphicx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
