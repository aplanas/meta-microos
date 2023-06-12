SUMMARY = "Bulgarian translation of the pst-eucl documentation"
DESCRIPTION = "The pst-eucl package documentation in Bulgarian language - \
Euclidean Geometry with PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.2svn19296"

RPM_NAME = "texlive-pst-eucl-translation-bg-2023.201.1.3.2svn19296-52.1.noarch.rpm"
RPM_HASH = "0ecc270a2ce38b4e04646551ad7a269bf37eb5e1f95c67109d3c68b18dfce53f97fc07831a4c252d3ed604a1ffa907d8fbdd9a4d02569882d10873c97bcbd779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-eucl-translation-bg"
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
