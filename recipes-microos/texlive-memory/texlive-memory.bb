SUMMARY = "Containers for data in LaTeX"
DESCRIPTION = "The package allows the user to declare single object or array \
containers."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn30452"

RPM_NAME = "texlive-memory-2023.201.1.2svn30452-52.1.noarch.rpm"
RPM_HASH = "c4228f29374c761aac866c6aac3fc7ac86323ee156a113cc9f19f102118e23e907d991683cd2493f177cc6b2748be5519991f9be7b6539abb1f5e788a9d57e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(memory.sty) texlive-memory"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
