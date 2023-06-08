SUMMARY = "Binary files of cachepic"
DESCRIPTION = "Binary files of cachepic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15543"

RPM_NAME = "texlive-cachepic-bin-2023.20230311.svn15543-89.1.aarch64.rpm"
RPM_HASH = "d1c5a12988c7f0e7917a845e2babf85c0071ccbc083158130deee50cb83709544cdcadccd563fe4292bef24acfd5eb8ea72ea7f4cbcf09b21520917e055e3b34"

RPROVIDES:${PN} += "texlive-cachepic-bin texlive-cachepic-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-cachepic"

inherit rpm
