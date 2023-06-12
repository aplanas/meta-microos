SUMMARY = "Slovak introduction to LaTeX"
DESCRIPTION = "A Slovak translation of Oetiker's (not so) short introduction."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-lshort-slovak-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "7a7e136ae52d99d3030b01690f272f044709e97ca64a1652404c046fec9c202bfc5e383b7917892e7ed027509bdf4b5fd41d82732f533f37abd7b9b6a568272c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-slovak"
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
