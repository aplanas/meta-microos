SUMMARY = "Graphical and textual clocks for TeX and LaTeX"
DESCRIPTION = "Features graphical clocks (with a classical 12h dial and two \
hands) and text clocks (in 24h format) which can show system \
time or any time the user desires. Works with both TeX and \
LaTeX. The clock faces (appearances of the dial) are easily \
expandable; the default uses a custom Metafont font."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-clock-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "d517f34061a7c35f3ea538ae06d5e5b44633870fcb7ed4071be11f1dcccd99745c317c05a821b1a3b89d4904d7299146bbd9a0f8b12e98873e2513e1b1ed5518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(clock.sty) \
tex(clock.tex) \
tex(clock.tfm) \
texlive-clock"
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
