SUMMARY = "Draw a Soroban using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw a Japanese abacus, or \
soroban. The soroban is still used in Japan today."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "26168f3e0e9833315f934000922f33d9511346cb1489b3d0c9278521cb167357092444a9178ec170639a4d70b82bc0f085c8bdaf16c77f294ec31a40ab479894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-soroban.sty) \
texlive-pst-soroban"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
tex(pstricks-add.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
