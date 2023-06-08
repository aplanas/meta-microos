SUMMARY = "The Oil Runtime Compiler"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.33"

RPM_NAME = "orc-0.4.33-1.3.aarch64.rpm"
RPM_HASH = "e039d0d9f1fa554f9e8cab8b4ed598f51dbb36cd5d31b4db842bfd4a963e694bdc6c3dfd8189ab25120e93961c7e5e254856518db997104d8eec7af571d36b50"

RPROVIDES:${PN} += "orc orc(aarch-64) orc-devel pkgconfig(orc-0.4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liborc-0.4.so.0()(64bit)"

inherit rpm
