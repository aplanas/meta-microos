SUMMARY = "Binary files of bib2gls"
DESCRIPTION = "Binary files of bib2gls"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45266"

RPM_NAME = "texlive-bib2gls-bin-2023.20230311.svn45266-91.1.aarch64.rpm"
RPM_HASH = "ee17a6b99bc67d4ba4620ab19d796ad998b61c7e5d3242fbd2f59acbf1aa7657c5d09bce6465d9b9fd2ec332c15ec7938f100844ee8c9a6a8deb2fc04e4bc9da"

RPROVIDES:${PN} += "texlive-bib2gls-bin texlive-bib2gls-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-bib2gls"

inherit rpm
