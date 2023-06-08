SUMMARY = "Binary files of lacheck"
DESCRIPTION = "Binary files of lacheck"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-lacheck-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "0a6896702a5793c5e837ee8701288f4d5a330621b83faad9b664f7c80d9936ceb18c497f7b73398fbf5619d2d7c898d0b8c13c37ba0f24e494d1d8d6848f756c"

RPROVIDES:${PN} += "texlive-lacheck-bin texlive-lacheck-bin(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) texlive-lacheck"

inherit rpm
