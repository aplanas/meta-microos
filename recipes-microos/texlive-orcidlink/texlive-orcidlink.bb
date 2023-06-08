SUMMARY = "Insert hyperlinked ORCiD logo"
DESCRIPTION = "This package provides a command to insert the ORCiD logo, which \
is hyperlinked to the URL of the researcher whose iD was \
specified."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn59560"

RPM_NAME = "texlive-orcidlink-2023.201.1.0.4svn59560-54.1.noarch.rpm"
RPM_HASH = "8696ee67d24eb3bf221b5943eeded34c4d700fb9401d674611095e1e12dc9b93904751311cc9675c123be412988a5ee5019b4508129252b4fe2d38400d37726c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(orcidlink.sty) texlive-orcidlink"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(hyperref.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
