SUMMARY = "Command-line Program for Getting and Setting the Contents of the X Selection"
DESCRIPTION = "XSel is a command-line program for getting and setting the contents of the X \
selection. Normally this is only accessible by manually highlighting \
information and pasting it with the middle mouse button."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "xsel-1.2.0-20.1.aarch64.rpm"
RPM_HASH = "5fd6e4abec6c81a3151f45135154c68e92386c52b3b9f1b658bb4592e304d98c1559808dce64879ee8b8102e89d03e75634687cfef58e0a1a027dbbfa79c8dfc"

RPROVIDES:${PN} += "xsel \
xsel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
