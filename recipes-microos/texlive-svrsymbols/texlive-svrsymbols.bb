SUMMARY = "A font with symbols for use in physics texts"
DESCRIPTION = "The svrsymbols package is a LaTeX interface to the SVRsymbols \
font. The glyphs of this font are ideograms that have been \
designed for use in physics texts. Some symbols are standard \
and some are entirely new."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-2023.201.2.0bsvn50019-57.1.noarch.rpm"
RPM_HASH = "65345d9a37a98c67dd91d38c5d56ab1db0ea36c546fa2ea882122629e6489e9b46513dc4898202a3d35081c0233d8f0b9da5fb4e7f42fab9a27b42c6e03559f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(SVRsymbols.tfm) \
tex(svrsymbols.map) \
tex(svrsymbols.sty) \
texlive-svrsymbols"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-svrsymbols-fonts"

inherit rpm
