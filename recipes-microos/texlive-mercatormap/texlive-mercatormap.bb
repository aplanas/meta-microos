SUMMARY = "Spherical Mercator coordinate systems and Web Mercator tile integration"
DESCRIPTION = "This package extends TikZ with tools to create map graphics. \
The provided coordinate system relies on the Web Mercator \
projection used on the Web by OpenStreetMap and others. The \
package supports the seamless integration of graphics from \
public map tile servers by a Python script. Also, common map \
elements like markers, geodetic networks, bar scales, routes, \
orthodrome pieces, and more are part of the package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn56060"

RPM_NAME = "texlive-mercatormap-2023.201.1.02svn56060-54.1.noarch.rpm"
RPM_HASH = "9ce4a2f5e08c1dbd82eb1fec1ef8cdea14e6b537a05d9f33a4c8b8738ce39ed88bdbcf84a44b862aa8ce56c98cecb3ff2e9dc79468abbcb3aa2e26c35bf41fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mercatormap.sty) \
tex(mercatorpy.def) \
tex(mercatorsupplier.def) \
texlive-mercatormap"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(graphicx.sty) \
tex(pdftexcmds.sty) \
tex(siunitx.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
