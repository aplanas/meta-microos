SUMMARY = "Binary files of de-macro"
DESCRIPTION = "Binary files of de-macro"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17399"

RPM_NAME = "texlive-de-macro-bin-2023.20230311.svn17399-91.1.aarch64.rpm"
RPM_HASH = "8718ab6cbc61ca276e39d4af377791c21008df8c397822c31472376ba15032e88c25a1c5bd7e48faffe620f3e6f0b774291157a919c6b15bcc067b3ab0af64cc"

RPROVIDES:${PN} += "texlive-de-macro-bin texlive-de-macro-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-de-macro"

inherit rpm
