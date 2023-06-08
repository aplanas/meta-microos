SUMMARY = "Binary files of splitindex"
DESCRIPTION = "Binary files of splitindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29688"

RPM_NAME = "texlive-splitindex-bin-2023.20230311.svn29688-89.1.aarch64.rpm"
RPM_HASH = "75689c0b340b9ed9e6accfe1ee7624f97541e00eee4870b5b449282d8dfa445a69cc140daab7cee3058e7cce479b9e751d181f665894e8d36d347166c30c47d7"

RPROVIDES:${PN} += "texlive-splitindex-bin texlive-splitindex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-splitindex"

inherit rpm
