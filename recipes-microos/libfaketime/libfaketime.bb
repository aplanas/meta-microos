SUMMARY = "FakeTime Preload Library"
DESCRIPTION = "report faked system time to programs without having to change the system-wide time"
LICENSE = "GPL-2.0-only"

PV = "0.9.10"

RPM_NAME = "libfaketime-0.9.10-1.6.aarch64.rpm"
RPM_HASH = "17cce6f99cb2202af9467aa6a3cfa9e6247f93eb73cd1eb0d7ed0ef0d9bf667c5223bd1ac8b47e56642e32a82654c8cba773b2e3302b744a17a9c56434ab8a8f"

RPROVIDES:${PN} += "libfaketime libfaketime(aarch-64) libfaketime.so.1()(64bit) libfaketime.so.1(GLIBC_2.2)(64bit) libfaketime.so.1(GLIBC_2.2.5)(64bit) libfaketime.so.1(GLIBC_2.3.2)(64bit) libfaketime.so.1(GLIBC_2.3.3)(64bit) libfaketimeMT.so.1()(64bit) libfaketimeMT.so.1(GLIBC_2.2)(64bit) libfaketimeMT.so.1(GLIBC_2.2.5)(64bit) libfaketimeMT.so.1(GLIBC_2.3.2)(64bit) libfaketimeMT.so.1(GLIBC_2.3.3)(64bit)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
