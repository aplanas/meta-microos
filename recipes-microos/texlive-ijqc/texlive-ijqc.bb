SUMMARY = "BibTeX style file for the Intl. J. Quantum Chem"
DESCRIPTION = "ijqc.bst is a BibTeX style file to support publication in \
Wiley's International Journal of Quantum Chemistry. It is not \
in any way officially endorsed by the publisher or editors, and \
is provided without any warranty one could ever think of."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-ijqc-2023.201.1.2svn15878-52.1.noarch.rpm"
RPM_HASH = "d101c54ca1a087cbe58f4c884d9482b645c2f391c97ab4f147081642197b40585ca248d92b4fc7a3ca1a3ae690984cf82d4ae5418e7cc731e0fed5a5472c03a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijqc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
