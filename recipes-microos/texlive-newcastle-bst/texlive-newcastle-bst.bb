SUMMARY = "A BibTeX style to format reference lists in the Harvard at Newcastle style"
DESCRIPTION = "This package provides a BibTeX style to format reference lists \
in the Harvard at Newcastle style recommended by Newcastle \
University. It should be used alongside natbib for citations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn62856"

RPM_NAME = "texlive-newcastle-bst-2023.201.1.1svn62856-54.1.noarch.rpm"
RPM_HASH = "fb63d36935768266969558685a416829ff8b2dc4f43fb6d471b27e86b33e8515b243ba977366c8ffc9ad8aa1a327a889dface510831a116172896a045d86b3b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcastle-bst"
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
