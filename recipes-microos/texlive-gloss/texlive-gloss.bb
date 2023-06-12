SUMMARY = "Create glossaries using BibTeX"
DESCRIPTION = "A glossary package using BibTeX with \\cite replaced by \\gloss."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2svn15878"

RPM_NAME = "texlive-gloss-2023.201.1.5.2svn15878-53.1.noarch.rpm"
RPM_HASH = "e37313633a69077e6968397d5f763f3d8ac48d252a683c3b92bbe67ae062e2c3615d78ee20aaea04897ac614144d5c218fc95c7881e165ac8354f7d8ca975748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gloss.sty) \
texlive-gloss"
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
