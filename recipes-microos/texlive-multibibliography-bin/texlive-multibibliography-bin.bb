SUMMARY = "Binary files of multibibliography"
DESCRIPTION = "Binary files of multibibliography"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30534"

RPM_NAME = "texlive-multibibliography-bin-2023.20230311.svn30534-89.1.aarch64.rpm"
RPM_HASH = "f2b1550ae2a8224cdd582d78be7347ede384b45aa15bc16e3c08bf3c61c6a866353b0d37446394faafbfa7ba74230e0821b67a4d75fa96a2cd6c81a0004cbb26"

RPROVIDES:${PN} += "texlive-multibibliography-bin texlive-multibibliography-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-multibibliography"

inherit rpm
