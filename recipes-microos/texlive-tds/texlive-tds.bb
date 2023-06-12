SUMMARY = "The TeX Directory Structure standard"
DESCRIPTION = "Defines a structure for placement of TeX-related files on an \
hierarchical file system, in a way that is well-defined, and is \
readily implementable."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64477"

RPM_NAME = "texlive-tds-2023.201.1.1svn64477-54.1.noarch.rpm"
RPM_HASH = "c7df78d7b0bfc54c9d982de7c61ade54729ad7565fab0c0ef28a444f5ed373fe9b2cd9e90bdeeb8114800c9497f1654ea8274ebfb9f01b0449b32b0785cc10c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tds"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
