SUMMARY = "Place lines through maths formulae"
DESCRIPTION = "A package to draw diagonal lines ('cancelling' a term) and \
arrows with limits (cancelling a term 'to a value') through \
parts of maths formulae."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.2svn32508"

RPM_NAME = "texlive-cancel-2023.201.2.2svn32508-52.1.noarch.rpm"
RPM_HASH = "b39d44d018b8755515f33c8dadeff3e97d7354bda71293373809a2261723f5f8ab3b46bbec3a92fc8e5a32448f2b24d152f64e8928a5354e55d295065325d222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cancel.sty) \
texlive-cancel"
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
