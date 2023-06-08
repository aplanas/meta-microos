SUMMARY = "Draw cartesian coordinate systems"
DESCRIPTION = "The package provides commands for typesetting number lines \
(coordinate axes), coordinate systems and grids in the picture \
environment. The package may be integrated with other drawing \
mechanisms: the documentation shows examples of drawing graphs \
(coordinate tables created by Maple), using the eepic package's \
drawing capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.4svn15878"

RPM_NAME = "texlive-coordsys-2023.204.1.4svn15878-54.1.noarch.rpm"
RPM_HASH = "7a18c2b972edeaabf2c477d06c85704fb63e9f01d9fe2dcda0e347fa817a157dfb21ab59ec0b3fad0f293298aa79b633264ce0a9343591989e28f972358fa576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(coordsys.sty) tex(logsys.sty) texlive-coordsys"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
