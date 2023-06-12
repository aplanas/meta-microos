SUMMARY = "Draw three-dimensional ribbons"
DESCRIPTION = "The package uses PStricks and pst-solides3d to draw three \
dimensional ribbons on a cylinder, torus, sphere, cone or \
paraboloid. The width of the ribbon, the number of turns, the \
colour of the outer and the inner surface of the ribbon may be \
set. In the case of circular and conical helices, one may also \
choose the number of ribbons."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-2023.201.1.2svn23464-53.1.noarch.rpm"
RPM_HASH = "6f5f2bb50e32a26158e3a007c14561806856b59144d5692592137ee4d3715f749df5df32756faf7aa86d4c1d87ca47341c945389146a4168e14e6991a043910a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-rubans.sty) \
tex(pst-rubans.tex) \
texlive-pst-rubans"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
