SUMMARY = "Control float placement"
DESCRIPTION = "Defines a \\FloatBarrier command, beyond which floats may not \
pass; useful, for example, to ensure all floats for a section \
appear before the next \\section command."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.2svn19848"

RPM_NAME = "texlive-placeins-2023.201.2.2svn19848-51.1.noarch.rpm"
RPM_HASH = "9a3cd9a923fd5d9170e5bcac70f1e9950e33e3c333dceb8127f97e58655da093845bcc884477e8bac8c4b598727aa8578959e0d3b4ef71b124b10d4db0d393e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(placeins.sty) texlive-placeins"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
