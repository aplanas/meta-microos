SUMMARY = "Library to work with PKCS#11 modules"
DESCRIPTION = "p11-kit provides a way to load and enumerate PKCS#11 modules, as well \
as a standard configuration setup for installing PKCS#11 modules in \
such a way that they're discoverable."
LICENSE = "BSD-3-Clause"

PV = "0.24.1"

RPM_NAME = "libp11-kit0-0.24.1-2.3.aarch64.rpm"
RPM_HASH = "48dd294fa76148537a6d4f9ff3b7bb5b19156d21572e24f791238feaa142dd569e690e9175970ac60be871e4eae4ca846e216c87357169c4a3110273f66e6e55"

RPROVIDES:${PN} += "libp11-kit.so.0()(64bit) \
libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) \
libp11-kit0 \
libp11-kit0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit)"

inherit rpm
