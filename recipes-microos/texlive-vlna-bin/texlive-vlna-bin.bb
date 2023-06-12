SUMMARY = "Binary files of vlna"
DESCRIPTION = "Binary files of vlna"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-vlna-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "03cd2a4971f9cfb9eee2e6e9a37b2cba778c3ba44b280497dbb45f25cd4a530a471915d79f6934d4deab3991ad36a84540b7c93c3cc144de1b1bc4c82ed33b61"

RPROVIDES:${PN} += "texlive-vlna-bin texlive-vlna-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-vlna"

inherit rpm
