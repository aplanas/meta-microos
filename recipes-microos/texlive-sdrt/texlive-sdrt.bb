SUMMARY = "Macros for Segmented Discourse Representation Theory"
DESCRIPTION = "The package provides macros to produce the 'Box notation' of \
SDRT (and DRT), to draw trees representing discourse relations, \
and finally to have an easy access to various mathematical \
symbols used in that theory, mostly with automatic mathematics \
mode, so they work the same in formulae and in text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-sdrt-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "1f5cc5866f4721548b336c77d909dc449bdab1cc86c25cfd50df1cba0dc0bc76f9dfdda6e585eac67a5c23991fb840956f7dda42152ef391ae9d33872ea2632b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sdrt.sty) \
texlive-sdrt"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(xyling.sty) \
tex(xytree.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
