SUMMARY = "Dockerfile Linter JavaScript API"
DESCRIPTION = "A smarter Dockerfile linter that helps you build best practice Docker images."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "hadolint-2.12.0-1.5.aarch64.rpm"
RPM_HASH = "2259288a447925b00035f2ba9789f20ecdba93b5b228449fab49ae1265b71d55e73363046bb878b9ca693330750918f1639eb353a4a644f870bf4d5c46adb64d"

RPROVIDES:${PN} += "hadolint \
hadolint(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatomic.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
