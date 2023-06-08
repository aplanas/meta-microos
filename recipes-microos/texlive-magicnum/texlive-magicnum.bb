SUMMARY = "Access TeX systems' 'magic numbers'"
DESCRIPTION = "This package allows access to the various parameter values in \
TeX (catcode values), e-TeX (group, if and node types, and \
interaction mode), and LuaTeX (pdfliteral mode) by a \
hierarchical name system."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn52983"

RPM_NAME = "texlive-magicnum-2023.201.1.7svn52983-52.1.noarch.rpm"
RPM_HASH = "ea10b6df75cf83d061e998e43d67634969bfb8df46f936c512cdfa421b24da5afbb43ae8e65d313397766fb55c533732ebc433cdcbd79b7aad87e88c6fbfb88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(magicnum.sty) texlive-magicnum"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(iftex.sty) tex(infwarerr.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
