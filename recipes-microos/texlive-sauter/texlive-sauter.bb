SUMMARY = "Wide range of design sizes for CM fonts"
DESCRIPTION = "Extensions, originally to the CM fonts, providing a \
parameterization scheme to build Metafont fonts at true design \
sizes, for a large range of sizes. The scheme has now been \
extended to a range of other fonts, including the AMS fonts, \
bbm, bbold, rsfs and wasy fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.4svn13293"

RPM_NAME = "texlive-sauter-2023.201.2.4svn13293-53.1.noarch.rpm"
RPM_HASH = "eeb0b83061c7abbb25cd632f301114208475e8471d93c2f3bcb8b473f8c61c2a1fff5ab5d9c74c73ca8cc4c24c8dcb469e832224ad722f4538a3c3ba008b059c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauter"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
