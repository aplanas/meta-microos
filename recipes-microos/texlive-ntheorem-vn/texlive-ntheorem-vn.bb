SUMMARY = "Vietnamese translation of documentation of ntheorem"
DESCRIPTION = "This is a translation of the documentation provided with \
ntheorem."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.203svn15878"

RPM_NAME = "texlive-ntheorem-vn-2023.201.1.203svn15878-54.1.noarch.rpm"
RPM_HASH = "f63e3805e9128e1dc26be648c9ee567eee57bbc0db38f6510f7d2d62995c21ce65307e3e2e427c289a7b1fc9b417a8f5408887c19791e78895f722d85f3e1382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ntheorem-vn"
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
