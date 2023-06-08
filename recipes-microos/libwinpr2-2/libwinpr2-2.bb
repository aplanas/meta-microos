SUMMARY = "Windows Portable Runtime"
DESCRIPTION = "WinPR provides API compatibility for applications targeting non-Windows \
environments. When on Windows, the original native API is being used instead of \
the equivalent WinPR implementation, without having to modify the code using it."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "libwinpr2-2-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "73c58840aeb83098254e24d6dc12a077d6114cdcb5c5e63d0885d7f743fabb99cf05e2628a1da73c434120d33ac0a7128b1957f39518ae766b10954693d7ee35"

RPROVIDES:${PN} += "libwinpr-tools2.so.2()(64bit) libwinpr2 libwinpr2-2 libwinpr2-2(aarch-64) libwinpr2.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
