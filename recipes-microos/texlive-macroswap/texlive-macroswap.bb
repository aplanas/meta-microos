SUMMARY = "Swap the definitions of two LaTeX macros"
DESCRIPTION = "The package provides simple utility methods to swap the meaning \
(token expansion) of two macros by name."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn31498"

RPM_NAME = "texlive-macroswap-2023.201.1.1svn31498-52.1.noarch.rpm"
RPM_HASH = "530a150a90ec83a978f1059e16b7a043b9e0e45272644ccfa4b8e9572078f11c15e79fbdf80f5a55c9bcad1227af91c04e8e8a2d3fadf3813a5d0e8583566dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(macroswap.sty) texlive-macroswap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
