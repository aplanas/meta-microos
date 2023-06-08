SUMMARY = "Generalisations of the page advance commands"
DESCRIPTION = "Provides \\clearpage and \\newpage variants that guarantee to end \
up on even/odd numbered pages; these 4 commands all have an \
optional argument whose content will be placed on any 'empty' \
page generated."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-nextpage-2023.201.1.1asvn15878-54.1.noarch.rpm"
RPM_HASH = "150e4e0e99ccb711a4c7755d4846cabd09080a50e9673d834de2662a28e3869994afee93dace3b0b78073b3fdee27c463f65f2c21c6f37bbf9e9439a35a7ed94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nextpage.sty) texlive-nextpage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
