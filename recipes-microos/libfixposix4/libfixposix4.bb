SUMMARY = "Shared library for libfixposix"
DESCRIPTION = "Thin wrapper over POSIX syscalls. \
The purpose of libfixposix is to offer replacements for parts of POSIX \
whose behaviour is inconsistent across *NIX flavours. \
 \
This package contains the shared library."
LICENSE = "BSL-1.0"

PV = "0.5.1"

RPM_NAME = "libfixposix4-0.5.1-1.1.aarch64.rpm"
RPM_HASH = "22738a2cacbd3a76c92e1b183d9c4a1366575c907424f5c976a87c9079122c2a5e36ff6147bbee13db3e093b0d54e63c0f1b51dea8625867cbe18ec622c207df"

RPROVIDES:${PN} += "libfixposix.so.4()(64bit) \
libfixposix4 \
libfixposix4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
