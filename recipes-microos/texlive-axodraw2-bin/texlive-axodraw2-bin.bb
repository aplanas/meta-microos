SUMMARY = "Binary files of axodraw2"
DESCRIPTION = "Binary files of axodraw2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-axodraw2-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "f0b4ac2afd34d9edd6684427e83c7190d3519b60414057291c3b9226fde08309612a4b0315658934e7025ede4d9412258b6a713f209169eb2f30d8ac0d537479"

RPROVIDES:${PN} += "texlive-axodraw2-bin texlive-axodraw2-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) texlive-axodraw2"

inherit rpm
