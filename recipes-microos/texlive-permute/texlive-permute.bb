SUMMARY = "Support for symmetric groups"
DESCRIPTION = "A package for symmetric groups, allowing you to input, output, \
and calculate with them."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-permute-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "bdb311f0b61162a28da075532b2d144ca172fc44c4d1372c5d18c9392bad89a3465a282ac0ea0ac2ba3b869138baf34204cda6e6ea13648072caaa11c950c165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(permute.sty) \
texlive-permute"
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
