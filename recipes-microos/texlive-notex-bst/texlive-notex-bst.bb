SUMMARY = "A BibTeX style that outputs HTML"
DESCRIPTION = "noTeX.bst produces a number of beautifully formatted HTML P \
elements instead of TeX code. It can be used to automatically \
generate bibliographies to be served on the web starting from \
BibTeX files."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn42361"

RPM_NAME = "texlive-notex-bst-2023.201.svn42361-54.1.noarch.rpm"
RPM_HASH = "9a1f5de45be99af9ff7b2e8f8678485ebcd0533fee66467168af122ac77c6e2288f96206f9c33db3371ce59a6a6eb8239ba390f4f4789c42df4fc54de71803ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notex-bst"
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
