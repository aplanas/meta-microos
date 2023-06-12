SUMMARY = "Creates miniature documents inside other LaTeX documents"
DESCRIPTION = "This package can be used to create miniature documents inside \
other LaTeX documents. Inside the minidocument all features of \
the outer vertical mode like page breaking, floats, marginpars, \
etc. are available."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn43752"

RPM_NAME = "texlive-minidocument-2023.201.1.0svn43752-54.1.noarch.rpm"
RPM_HASH = "ca58f0cf2d42b9bdaaa22076883cd65c93b0275f51519a91dcb82d999fc3e74fa9e02769c39adb941af80b9d64c51874697c33886b873a8dbc538779f642c8e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minidocument.sty) \
texlive-minidocument"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphics.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
