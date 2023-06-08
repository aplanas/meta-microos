SUMMARY = "Copperplate calligraphic letters in LaTeX"
DESCRIPTION = "Provides a maths interface to the rsfs fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17125"

RPM_NAME = "texlive-calrsfs-2023.201.svn17125-52.1.noarch.rpm"
RPM_HASH = "75e644a79a7d8a463925a026607f50876a09b26c984ac71e8c796b7dce85ce9b8d1a01e65275e9ee42e30341d429d3a94f7e5e9bb4d4e76993f07b7e4f363c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(OMSrsfs.fd) tex(calrsfs.sty) texlive-calrsfs"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
