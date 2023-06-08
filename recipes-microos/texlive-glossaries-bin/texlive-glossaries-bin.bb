SUMMARY = "Binary files of glossaries"
DESCRIPTION = "Binary files of glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37813"

RPM_NAME = "texlive-glossaries-bin-2023.20230311.svn37813-89.1.aarch64.rpm"
RPM_HASH = "7e1fb28ac6d953e4880af2aa94d348682d09bd7e139edb8b146647285d6e3da472169ae87f494949369b45fcccf87eb8db880749e47a4fbdd1bfeca6c8265881"

RPROVIDES:${PN} += "texlive-glossaries-bin texlive-glossaries-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-glossaries"

inherit rpm
