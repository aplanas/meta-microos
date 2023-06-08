SUMMARY = "Tabulated lists of short items"
DESCRIPTION = "This package offers environments and commands for one-level and \
two-level lists of short items (e.g., exercises in textbooks). \
The environments support optional arguments of item numbering \
similar to the enumerate or paralist packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0esvn15878"

RPM_NAME = "texlive-tablists-2023.201.0.0.0esvn15878-54.1.noarch.rpm"
RPM_HASH = "408d9ea1ad86448ee4fbbd6a1ed3c0260c413d1bcc4195d527e95f3385b2b7e591311b3f2bfd0909281ed9f8b74f73ef1b3558e120d65ba6ae6c61faa9549b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tablists.sty) texlive-tablists"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(makecell.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
