SUMMARY = "Binary files of pmx"
DESCRIPTION = "Binary files of pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pmx-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "1f66564687088a59da67b6b493edf6d589356db2cbf123e389be6a4a18b9a6d30ee29992ed16f59b5ecf1c21242909dfaaf2876b24bb6aa44ae4fd10d5256632"

RPROVIDES:${PN} += "texlive-pmx-bin \
texlive-pmx-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
texlive-pmx"

inherit rpm
