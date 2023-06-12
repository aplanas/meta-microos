SUMMARY = "Persian version of alpha.bst"
DESCRIPTION = "The package provides a Persian version of the alpha BibTeX \
style and offers several enhancements. It is compatible with \
the hyperref, url, natbib, and cite packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn66115"

RPM_NAME = "texlive-alpha-persian-2023.201.1.3svn66115-54.1.noarch.rpm"
RPM_HASH = "e83d759c831d95571915232d39b759884faa011cd2c7504842a4773ec649fd62581d4969bf0a991266b2cbd80bc7f32c48cb11f9fedd919b1c01881cf94ef8fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alpha-persian"
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
