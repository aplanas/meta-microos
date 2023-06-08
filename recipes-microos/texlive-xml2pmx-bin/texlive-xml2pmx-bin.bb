SUMMARY = "Binary files of xml2pmx"
DESCRIPTION = "Binary files of xml2pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xml2pmx-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "5dbdc9cac2ce409541c899c87c5c24761ce08ac677844ef140e24b620b7d57f92723440aed5563c2aa331e849d90858a45fdf6904a0e94e04b4df481b18de727"

RPROVIDES:${PN} += "texlive-xml2pmx-bin texlive-xml2pmx-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-xml2pmx"

inherit rpm
