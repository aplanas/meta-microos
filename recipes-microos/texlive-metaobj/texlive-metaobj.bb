SUMMARY = "MetaPost package providing high-level objects"
DESCRIPTION = "METAOBJ is a large MetaPost package providing high-level \
objects. It implements many of PSTricks' features for node \
connections, but also trees, matrices, and many other things. \
It more or less contains boxes.mp and rboxes.mp. There is a \
large (albeit not complete) documentation distributed with the \
package. It is easily extensible with new objects."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.93svn15878"

RPM_NAME = "texlive-metaobj-2023.201.0.0.93svn15878-54.1.noarch.rpm"
RPM_HASH = "e0db311a55ad4c07dcb56825266da27b65442ae472ed2da4431a4cd5afc123796a3837b25f61a314fa8fb704b74d801dd52260847ed18d50d7735f5944ab3916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaobj"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
