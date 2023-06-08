SUMMARY = "A command-line hex viewer"
DESCRIPTION = "hexyl is a simple hex viewer for the terminal. It uses a colored output \
to distinguish different categories of bytes (NUL bytes, printable \
ASCII characters, ASCII whitespace characters, other ASCII characters \
and non-ASCII)."
LICENSE = "Apache-2.0"

PV = "0.12.0"

RPM_NAME = "hexyl-0.12.0-1.2.aarch64.rpm"
RPM_HASH = "c938020ff855fc3a64d823975e0e524cdfc0f74b38a6bbc7079c072f3554a993ef2a58b88d4d5a8463d2ea91ed5d881b568411d0bf5c0089111d82104723ae6e"

RPROVIDES:${PN} += "hexyl hexyl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
