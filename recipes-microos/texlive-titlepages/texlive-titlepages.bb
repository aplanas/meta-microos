SUMMARY = "Sample titlepages, and how to code them"
DESCRIPTION = "The document provides examples of over two dozen title page \
designs based on a range of published books and theses, \
together with the LaTeX code used to create them."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19457"

RPM_NAME = "texlive-titlepages-2023.201.svn19457-52.1.noarch.rpm"
RPM_HASH = "434bc2f7da416a3272e0cc05016640526d9dc45e627cb544f5d24a9b47981f6b1016d9c059bad32c838b4602d309a8e40bc301450ae9535e5d0b16fa91027e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlepages"
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
