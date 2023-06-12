SUMMARY = "'\\listfiles' entries from the command line"
DESCRIPTION = "The package provides a Unix shell script to display a list of \
LaTeX \\Provides...-command contexts on screen. Provision is \
made for controlling the searches that the package does. The \
package was developed on a Unix-like system, using (among other \
things) the gnu variant of the find command."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-adhocfilelist-2023.201.svn29349-54.1.noarch.rpm"
RPM_HASH = "7260b079c3cb28312155aaf8e1b6199788d601b5ba3b4bec69e6700435539c658078adec32117c69d5fda585110d21ed69a9274b43131488c1804c469e7dac67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adhocfilelist"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-adhocfilelist-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
