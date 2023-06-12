SUMMARY = "Fixed-font code blocks formatted nicely"
DESCRIPTION = "This LaTeX package helps you write source code in your academic \
papers and make it looks neat. It uses minted and tcolorbox, \
configuring them the right way, to ensure that code fragments \
and code blocks look nicer."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.0svn65170"

RPM_NAME = "texlive-ffcode-2023.201.0.0.8.0svn65170-52.1.noarch.rpm"
RPM_HASH = "e04bb6492957b976a702869947086ab24171182603889e4638e04b0674de464e6fb0125af7f2ed8b1b9766c453b2db3a7040b37c2e59e16d49eb64edd1142466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ffcode.sty) \
texlive-ffcode"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(minted.sty) \
tex(pgfopts.sty) \
tex(tcolorbox.sty) \
texlive \
texlive-environ \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-microtype \
texlive-minted \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-tcolorbox \
texlive-xkeyval"

inherit rpm
