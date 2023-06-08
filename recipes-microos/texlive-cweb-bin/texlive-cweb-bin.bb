SUMMARY = "Binary files of cweb"
DESCRIPTION = "Binary files of cweb"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cweb-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "69d32582370113c90b7a40a16d307f8006e164adc7a12c698c552ec3488ece593e3100255bc69b8bdbbf7cfc883c0b70a5b82c2f374198ab6bbfc7a92d434428"

RPROVIDES:${PN} += "texlive-cweb-bin texlive-cweb-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-cweb"

inherit rpm
