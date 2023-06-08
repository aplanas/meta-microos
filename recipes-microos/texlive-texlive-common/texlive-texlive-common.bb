SUMMARY = "TeX Live documentation (common elements)"
DESCRIPTION = "The texlive-common package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66324"

RPM_NAME = "texlive-texlive-common-2023.201.svn66324-54.1.noarch.rpm"
RPM_HASH = "c7c7620bf6e1efe0fee56dd2c94dbf0525bf06a446a828bcb2ac1e511797e964e8f1c0aae470026c887a0b8152f0bc2e26b9bc9a2d52e3a499c95bf28b55117c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-common"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
