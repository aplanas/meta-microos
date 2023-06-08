SUMMARY = "3D animations"
DESCRIPTION = "Create animations of 3-dimensional objects (such as polyhedra) \
in MetaPost."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn29349"

RPM_NAME = "texlive-mp3d-2023.201.1.34svn29349-54.1.noarch.rpm"
RPM_HASH = "a0011075023cdb814b74c0753ef404d0981e43dab0e95ed168ec67a69aa93a917458e6f9f9facaac8450dc06e4e6b73032a4b9c6ee01bf322da10c8264164308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mp3d"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
