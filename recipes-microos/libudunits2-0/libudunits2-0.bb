SUMMARY = "Libraries for udunits2"
DESCRIPTION = "This package contains the runtime libraries for udunits2."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "libudunits2-0-2.2.28-1.8.aarch64.rpm"
RPM_HASH = "ac57931aca8f689eba55b7919b3c8f55813a05bb31616344bd64f69141eb73d8af5e7888176acba50e7a4748f36bef6d99bd4ced0b97e99183578eb39454db44"

RPROVIDES:${PN} += "libudunits2-0 libudunits2-0(aarch-64) libudunits2.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexpat.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
