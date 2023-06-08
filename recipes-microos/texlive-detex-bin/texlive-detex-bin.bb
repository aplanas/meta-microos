SUMMARY = "Binary files of detex"
DESCRIPTION = "Binary files of detex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-detex-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "849f2c8fd7b0ca4ce3ca5d724dc141b55d88cd8869f46dee9d419a252bc0ab00d0c58846f4eb17b92e910aa522b87c71ded30eefe9091bf2ef6571b47992700b"

RPROVIDES:${PN} += "texlive-detex-bin texlive-detex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-detex"

inherit rpm
