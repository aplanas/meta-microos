SUMMARY = "A Greek-alphabet font"
DESCRIPTION = "Solomos is a font which traces its descent from a \
calligraphically-inspired font of the mid-19th century. LaTeX \
support, for use with the LGR encoding only, is provided."
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn18651"

RPM_NAME = "texlive-gfssolomos-2023.201.1.0svn18651-52.1.noarch.rpm"
RPM_HASH = "ea69e26711cf034e2c3d07e619847b8e0408218a3c508568d384dd3f69bdf21575db113421293b970eba9470fae316fedab1e72e8c97c6f7f67c93ac28bad868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gfssolomos.map) tex(gfssolomos.sty) tex(gpsolomos.enc) tex(gsolomos8a.tfm) tex(gsolomos8a.vf) tex(gsolomos8r.tfm) tex(lgrsolomos.fd) texlive-gfssolomos"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-filesystem texlive-gfssolomos-fonts texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
