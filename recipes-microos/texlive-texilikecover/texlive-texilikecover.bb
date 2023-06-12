SUMMARY = "A cover-page package, like TeXinfo"
DESCRIPTION = "The package creates document cover pages, like those that \
TeXinfo produces."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-texilikecover-2023.201.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "55a3d8e48a6e753dbcfb2a8330ab04840f99d241c2baa40c8d881a48f1dcdb4edfc7621a118160df8beb662a003569ffc8009f8c74a1f2bdcb654450ab0b2fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(texilikecover.sty) \
texlive-texilikecover"
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
