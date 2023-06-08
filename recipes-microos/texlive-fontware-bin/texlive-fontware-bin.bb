SUMMARY = "Binary files of fontware"
DESCRIPTION = "Binary files of fontware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-fontware-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "6ce6de93d0a18e02f06936d6d9121ef8874faea143ca36f8fb51bf40ddbf3fbaa18a7868b2be11a7a1a3e0f268d28ebd19054f5d8e31017110bbcc5125561863"

RPROVIDES:${PN} += "texlive-fontware-bin texlive-fontware-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-fontware"

inherit rpm
