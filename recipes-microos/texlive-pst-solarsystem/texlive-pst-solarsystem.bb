SUMMARY = "Plot the solar system for a specific date"
DESCRIPTION = "The package uses pstricks to produce diagrams of the visible \
planets, projected on the plane of the ecliptic. It is not \
possible to represent all the planets in their real \
proportions, so only Mercury, Venus, Earth and Mars have their \
orbits in correct proportions and their relative sizes are \
observed. Saturn and Jupiter are in the right direction, but \
not in the correct size."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn45097"

RPM_NAME = "texlive-pst-solarsystem-2023.201.0.0.13svn45097-53.1.noarch.rpm"
RPM_HASH = "e0ceeb7c41f428dd98a85484f12a3be3651d9c6aa0130d6e3d0f70173b6053c1dbc654a91d173a38ac414e80438212f2bfd9f630c767e58290fc0fc992cd9a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-solarsystem.sty) tex(pst-solarsystem.tex) texlive-pst-solarsystem"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
