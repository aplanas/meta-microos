SUMMARY = "Notation for nuclear isotopes"
DESCRIPTION = "A simple package providing nuclear sub- and superscripts as \
commonly used in radiochemistry, radiation science, and nuclear \
physics and engineering applications. Isotopes which have Z \
with more digits than A require special spacing to appear \
properly; this spacing is supported in the package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn22256"

RPM_NAME = "texlive-nuc-2023.201.0.0.1svn22256-54.1.noarch.rpm"
RPM_HASH = "014afa66122ebf8236f28bf3a4097b09a9c08f9cd79a86d32f080639ef39530ca2b741c2838698d58b37487fd84b116ef3500998d2ac95d4d3a80c1864da7496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nuc.sty) \
texlive-nuc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
