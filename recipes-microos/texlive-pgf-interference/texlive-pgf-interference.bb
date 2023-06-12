SUMMARY = "Drawing interference patterns with PGF/TikZ"
DESCRIPTION = "This LaTeX package makes it possible to simulate interference \
patterns occuring on a screen if monochromatic light is \
diffracted at regular structures of slits. It makes use of the \
PGF/TikZ graphics package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn61562"

RPM_NAME = "texlive-pgf-interference-2023.201.0.0.1svn61562-51.1.noarch.rpm"
RPM_HASH = "d9dac5efb787a49b1a0473f0a5b26cceea4e9fc34a4814a5078fd3469d8544cacd058b44fb0768adf0102c126ada9a3291abcf6127fb2b1ffafad2e40be7ece7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgf-interference.sty) \
texlive-pgf-interference"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
