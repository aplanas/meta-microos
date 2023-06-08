SUMMARY = "Data merging for automatic document creation"
DESCRIPTION = "The package handles csv data merging for automatic document \
creation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn51306"

RPM_NAME = "texlive-context-handlecsv-2023.204.svn51306-54.1.noarch.rpm"
RPM_HASH = "764194a9ee89b97f266602b6295b05f90e4d366a83feef1086d76cddadeedc2eac4f0acbfbf01909bd6cd1dd99e9f6584360311ded6e911080b2c7583e8db886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-handlecsv.tex) texlive-context-handlecsv"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-context texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
