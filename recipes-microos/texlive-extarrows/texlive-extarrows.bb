SUMMARY = "Extra Arrows beyond those provided in amsmath"
DESCRIPTION = "Arrows are provided to supplement \\xleftarrow and \\xrightarrow \
of the amsath package: \\xlongequal, \\xLongleftarrow, \
\\xLongrightarrow, \\xLongleftrightarrow, \\xLeftrightarrow. \
\\xlongleftrightarrow, \\xleftrightarrow, \\xlongleftarrow and \
\\xlongrightarrow."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.2.0svn54400"

RPM_NAME = "texlive-extarrows-2023.201.1.2.0svn54400-52.1.noarch.rpm"
RPM_HASH = "5c88d4bcfb5a47a45eea94b3f6dfb3f8673ae1313f1c830bdd67650f941d95d4fd17a74bf2debbb7abdc7313c5bb1f69368b8bc457d45c1d7a779cfaec3f9976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(extarrows.sty) texlive-extarrows"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
