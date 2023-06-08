SUMMARY = "C library for learning video game programming"
DESCRIPTION = "A C library for learning video game programming."
LICENSE = "Zlib"

PV = "4.2.0"

RPM_NAME = "libraylib420-4.2.0-1.3.aarch64.rpm"
RPM_HASH = "5b0c4ed76be7017e6ba67ae45759fb8ca312b79b33ba4ba78525943716adf2a40977260c9b70f2971aa6d024a4fef6b3494a8fae7b64763c53b1adbd6a6cef09"

RPROVIDES:${PN} += "libraylib.so.420()(64bit) libraylib420 libraylib420(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
