SUMMARY = "A (Not So) Short Introduction to LaTeX2e"
DESCRIPTION = "The document derives from a German introduction ('lkurz'), \
which was translated and updated; it continues to be updated. \
This translation has, in its turn, been translated into several \
other languages; see the lshort catalogue entry for the current \
list."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.4svn58309"

RPM_NAME = "texlive-lshort-english-2023.201.6.4svn58309-54.1.noarch.rpm"
RPM_HASH = "3e5c6246952158e30129af7398cdb6f00f845826129be30925b1f34126254512c5e0811fa3c502cba20b370623ff5ff5c760a170677a3272b572beff5fb1c697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-english"
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
