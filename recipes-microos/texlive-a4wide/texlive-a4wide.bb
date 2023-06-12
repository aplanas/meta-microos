SUMMARY = "'Wide' a4 layout"
DESCRIPTION = "This package increases the width of the typeset area of an a4 \
page. This sort of operation is capable of producing \
typographically poor results; the operation itself is better \
provided by the geometry package. The package uses the a4 \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20943"

RPM_NAME = "texlive-a4wide-2023.201.svn20943-54.1.noarch.rpm"
RPM_HASH = "390024c9b0899c6eda40c5f45aab779e6318996d2c2ba8dcd2c0359b53c124f50b30d63e21e90c680faf02f0983a3cdadf81a03a5a0a61b91ec265a6009ece7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(a4wide.sty) \
texlive-a4wide"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(a4.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
