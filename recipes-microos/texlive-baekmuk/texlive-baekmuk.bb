SUMMARY = "Baekmuk Korean TrueType fonts"
DESCRIPTION = "This bundle consists of four Korean fonts: batang.ttf: serif \
dotum.ttf: sans-serif gulim.ttf: sans-serif (rounded) \
hline.ttf: headline These fonts were originally retrieved from \
http://kldp.net/baekmuk/ and are no longer maintained."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-2023.201.2.2.1svn56915-53.1.noarch.rpm"
RPM_HASH = "b7f4e6028beaa2f810e88a98f443d8fbf536def7bc4a5fc5f4ffa2b55a95f43e296f54bbeb5d18bc9cf5e305b3783599c476d1c4b40eeedb13c3141b67824785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baekmuk"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-baekmuk-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
