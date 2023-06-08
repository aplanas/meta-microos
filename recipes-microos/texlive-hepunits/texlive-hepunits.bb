SUMMARY = "A set of units useful in high energy physics applications"
DESCRIPTION = "Hepunits is a LaTeX package built on the SIunits package which \
adds a collection of useful HEP units to the existing SIunits \
set. These include the energy units \\MeV, \\GeV, \\TeV and the \
derived momentum and mass units \\MeVoverc, \\MeVovercsq and so \
on."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-2023.201.2.0.0svn54758-53.1.noarch.rpm"
RPM_HASH = "0c2fc546337a56155edde5edb27efd05d4bd31dd12b324fe1e6ab95877c55b34e45394c89ea382012dff62a8955e7365a6c7e09f11216ea788fa67c5a51d606c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hepunits.sty) texlive-hepunits"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(ifthen.sty) tex(siunitx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
