SUMMARY = "Multiple environments using a 'key=value' syntax"
DESCRIPTION = "The package provides a multienv environment which permits easy \
addition of multiple environments using a key=value syntax. \
Macros to define environments using this syntax are also \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64967"

RPM_NAME = "texlive-multienv-2023.201.1.0svn64967-54.1.noarch.rpm"
RPM_HASH = "5c1c0a357d0d677a3d3127eebdcfa095ad80105a5004c3087b880a00702c7eb70aeafb729b275185192df1807f4d4e87806b316633aeb674833f81c7a2d3684f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multienv.sty) texlive-multienv"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
