SUMMARY = "Place text over objects without obscuring background colors"
DESCRIPTION = "This is a PSTricks package which allows to place text over \
objects without obscuring background colors."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-2023.201.1.0svn44724-53.1.noarch.rpm"
RPM_HASH = "f899e86b74712a90c41810a47e2c9dfe5bd8ffb89f2eaa34ed58c55fa46d127d5a80bddca1ef9d5519b51993426d594a1fc2269e55693727adec24586af3e5c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-rputover.sty) \
tex(pst-rputover.tex) \
texlive-pst-rputover"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pst-node.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
