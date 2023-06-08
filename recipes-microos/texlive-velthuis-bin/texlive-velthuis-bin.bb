SUMMARY = "Binary files of velthuis"
DESCRIPTION = "Binary files of velthuis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-velthuis-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "135e898b6a5f2e4d86d2860cbde4c1ceb6492d5941580b1545936bb3d7faca987df1877139487d5b562b70ce944e00f0c94c24c424eb3740305cc2fd0dd9f788"

RPROVIDES:${PN} += "texlive-velthuis-bin texlive-velthuis-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-velthuis"

inherit rpm
