SUMMARY = "Extensions for package pict2e"
DESCRIPTION = "The package extends the drawing capacities of the pict2e that \
serves as a LaTeX2e replacement for picture mode. In \
particular, curve2e introduces new macros for lines and \
vectors, new specifications for line terminations and joins, \
arcs with any angular aperture, arcs with arrows at one or both \
ends, generic curves specified with their nodes and the tangent \
direction at these nodes."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.2.22svn65469"

RPM_NAME = "texlive-curve2e-2023.204.2.2.22svn65469-54.1.noarch.rpm"
RPM_HASH = "6b7acf1af019cd91f1f0ed7113975c023b46954cc0c7808468da53130f6b7b212e8664a3cf42719f97bff69557823f025ae2c8716b4dc5e15514710ea24b22bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(curve2e-v161.sty) \
tex(curve2e.sty) \
texlive-curve2e"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(graphicx.sty) \
tex(pict2e.sty) \
tex(xfp.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
