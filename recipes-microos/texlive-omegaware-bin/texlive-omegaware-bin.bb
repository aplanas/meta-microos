SUMMARY = "Binary files of omegaware"
DESCRIPTION = "Binary files of omegaware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-omegaware-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "02e4420374dc64a4ae6b740faac5642e2b6af51fceb78fc4456c90107ade7df648528ddc6e28e51cc65a0ab2def527eee53e6d09e4c9e62ef82f5bd6cea521e0"

RPROVIDES:${PN} += "texlive-omegaware-bin texlive-omegaware-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-omegaware texlive-uptex-bin"

inherit rpm
