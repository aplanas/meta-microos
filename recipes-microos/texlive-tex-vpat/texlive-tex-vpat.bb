SUMMARY = "TeX Accessibility Conformance Report"
DESCRIPTION = "TeX Accessibility Conformance Report based on ITI VPAT(R) \
guidelines. Currently it covers TeX Live. Other distributions \
can be added if needed."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1._june_2022svn63560"

RPM_NAME = "texlive-tex-vpat-2023.201.2.1._june_2022svn63560-54.1.noarch.rpm"
RPM_HASH = "2604789b8aecc9caec2d2264a3cc62fb033750e4ab4b9fde47442667a69afbe6aca3cf3a209f0d405cd71947874be85df14e07618ae2ae9302e147033e597d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-vpat"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
