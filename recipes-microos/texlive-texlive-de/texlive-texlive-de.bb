SUMMARY = "TeX Live manual (German)"
DESCRIPTION = "The texlive-de package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66573"

RPM_NAME = "texlive-texlive-de-2023.201.svn66573-54.1.noarch.rpm"
RPM_HASH = "3ab97e1f9d7f0df1cce0b33ce421b621536fe968714ad77849ece580998a5105783082d85643078f4f9d735cdd5a33628f626cf3af119a1825a920ab958d6eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-de"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
