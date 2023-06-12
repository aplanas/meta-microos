SUMMARY = "Library for processing of keyboard entry from terminal-based programs"
DESCRIPTION = "This library allows easy processing of keyboard entry from terminal-based \
programs. It handles all the necessary logic to recognise special keys, UTF-8 \
combining, and so on, with a simple interface."
LICENSE = "MIT"

PV = "0.22"

RPM_NAME = "libtermkey1-0.22-2.5.aarch64.rpm"
RPM_HASH = "ba20590d9e9ab94a94be739a77faf5515699af6082c88863ec1c84882a1717c115fd2ddb2570c6b6d23aa13c73d7a313b2014ed1cf7c4edfd5e0f52810d56368"

RPROVIDES:${PN} += "libtermkey.so.1()(64bit) \
libtermkey1 \
libtermkey1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libunibilium.so.4()(64bit)"

inherit rpm
