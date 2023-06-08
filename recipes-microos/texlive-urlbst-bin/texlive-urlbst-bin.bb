SUMMARY = "Binary files of urlbst"
DESCRIPTION = "Binary files of urlbst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23262"

RPM_NAME = "texlive-urlbst-bin-2023.20230311.svn23262-89.1.aarch64.rpm"
RPM_HASH = "42f208e8564206c730d7e2a9b653581eaa58fb7b404ca274d52d4a8f89fb2a1a695a8785c64e84988dbfaef547b1a1a5ffdf5f4b147a63a52e195547047d35fc"

RPROVIDES:${PN} += "texlive-urlbst-bin texlive-urlbst-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-urlbst"

inherit rpm
