SUMMARY = "Provides a figure-like environment that break over pages"
DESCRIPTION = "The longfigure package uses and relabels components of the \
well-known longtable package, written by David Carlisle, to \
provide a table-like environment that can display a stream of \
figures as a single figure that can break across pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn34302"

RPM_NAME = "texlive-longfigure-2023.201.1.0svn34302-54.1.noarch.rpm"
RPM_HASH = "0492a8e18e920d8337815814910a391b368868c2eddaaad902d369b9af5aef1eb508d18310c6c8eb5d8ef82208b9462d640259b8ca7d114c25b24eb927f715fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(longfigure.sty) \
texlive-longfigure"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tocloft.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
