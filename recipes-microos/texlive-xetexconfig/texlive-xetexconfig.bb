SUMMARY = "Crop.cfg for XeLaTeX"
DESCRIPTION = "The xetexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45845"

RPM_NAME = "texlive-xetexconfig-2023.201.svn45845-52.1.noarch.rpm"
RPM_HASH = "80365a450a4502aa77d4505ed3fa17cb254b4eae24547ce5b3976bfe5f5aa4b5cf8aa63a077cea869ae982a16d7405059f6b02f878d3e850618387aed2336373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(crop.cfg) texlive-xetexconfig"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
