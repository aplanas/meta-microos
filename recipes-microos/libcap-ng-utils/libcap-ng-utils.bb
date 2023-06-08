SUMMARY = "Utilities for analysing and setting file capabilities"
DESCRIPTION = "The libcap-ng-utils package contains applications to analyse the \
Linux process capabilities of programs running on a system. It also \
lets you set the filesystem-based capabilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng-utils-0.8.3-1.8.aarch64.rpm"
RPM_HASH = "a9d1ca2e33f205070a4c74cdab44d3b7811a038d5286bd86a67d575ddc2aec4f37bf7d928b1efab4461d8fae935dce7ba446c18f99f54caef35ada5d4d2c437c"

RPROVIDES:${PN} += "libcap-ng-utils libcap-ng-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap-ng.so.0()(64bit)"

inherit rpm
