SUMMARY = "Timelines for use with moderncv"
DESCRIPTION = "The package provides commands to configure and to draw time \
line diagrams; such diagrams are designed to fit into \
Curriculum Vitae documents written using the moderncv class."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn55518"

RPM_NAME = "texlive-moderntimeline-2023.201.0.0.11svn55518-54.1.noarch.rpm"
RPM_HASH = "ad7384649e829735290253ff3e3511ebe26a1c6192712156aa6bc9722d97a7f616a9e1a53892664c3745bf4a60ad5116a161da72a33475e9537152a758de7344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(moderntimeline.sty) \
texlive-moderntimeline"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
