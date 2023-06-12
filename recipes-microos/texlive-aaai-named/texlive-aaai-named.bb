SUMMARY = "BibTeX style for AAAI"
DESCRIPTION = "A BibTeX style derived from the standard master, presumably for \
use with the aaai package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn52470"

RPM_NAME = "texlive-aaai-named-2023.201.svn52470-54.1.noarch.rpm"
RPM_HASH = "546441be8ec6f5ebbbcba9b5892e978bde629f580f05f2804a43a72adacdfb123a5a0dd9a7a1770a978f2fc1d3a8db0a592d66cdc93efa519c20d7aec4d9f957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aaai-named"
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
