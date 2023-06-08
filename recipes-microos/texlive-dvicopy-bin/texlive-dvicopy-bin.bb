SUMMARY = "Binary files of dvicopy"
DESCRIPTION = "Binary files of dvicopy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvicopy-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "6b5c132fcb813e7683b364f971989fd287bb1e255d1d45e78b9d1030c696f48b3e5e47508beadaceb4daa4cd5ec12c45a5db2a8d2b31313855b76ff23a1a72dc"

RPROVIDES:${PN} += "texlive-dvicopy-bin texlive-dvicopy-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-dvicopy"

inherit rpm
