SUMMARY = "Sans serif blackboard bold"
DESCRIPTION = "A geometric sans serif blackboard bold font, for use in \
mathematics; Metafont sources are provided, as well as macros \
for use with LaTeX. The Sauter font package has Metafont \
parameter source files for building the fonts at more sizes \
than you could reasonably imagine. See the blackboard sampler \
for a feel for the font's appearance."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.01svn17187"

RPM_NAME = "texlive-bbold-2023.201.1.01svn17187-53.1.noarch.rpm"
RPM_HASH = "33efe659df5493df28cb56990b56c8d18575c191b839ba40c9c776f9419e618c61e7fc78adf695b7f8e939d9003a27fcffdcc1855a47b2f15702a3a5bfeebcbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Ubbold.fd) tex(bbold.sty) tex(bbold10.tfm) tex(bbold12.tfm) tex(bbold17.tfm) tex(bbold5.tfm) tex(bbold6.tfm) tex(bbold7.tfm) tex(bbold8.tfm) tex(bbold9.tfm) texlive-bbold"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
