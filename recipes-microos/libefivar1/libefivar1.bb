SUMMARY = "Library to manage UEFI variables"
DESCRIPTION = "Library to allow for the simple manipulation of UEFI variables."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "libefivar1-38-1.3.aarch64.rpm"
RPM_HASH = "0c191b7a6caa5d17a28528fd647697ea27be7e1292fb59fc6656bcf9304c97d3ee01040163acf9785357b58fec944701d6cc00e194b651f3049473b74bf7b9cf"

RPROVIDES:${PN} += "libefiboot.so.1()(64bit) libefiboot.so.1(LIBEFIBOOT_0.0)(64bit) libefiboot.so.1(LIBEFIBOOT_0.24)(64bit) libefiboot.so.1(LIBEFIBOOT_1.28)(64bit) libefiboot.so.1(LIBEFIBOOT_1.29)(64bit) libefiboot.so.1(LIBEFIBOOT_1.30)(64bit) libefiboot.so.1(LIBEFIBOOT_1.31)(64bit) libefiboot.so.1(libefiboot.so.0)(64bit) libefisec.so.1()(64bit) libefisec.so.1(LIBEFISEC_1.38)(64bit) libefisec.so.1(libefisec.so.0)(64bit) libefivar.so.1()(64bit) libefivar.so.1(LIBEFIVAR_0.0)(64bit) libefivar.so.1(LIBEFIVAR_0.24)(64bit) libefivar.so.1(LIBEFIVAR_1.28)(64bit) libefivar.so.1(LIBEFIVAR_1.29)(64bit) libefivar.so.1(LIBEFIVAR_1.30)(64bit) libefivar.so.1(LIBEFIVAR_1.33)(64bit) libefivar.so.1(LIBEFIVAR_1.35)(64bit) libefivar.so.1(LIBEFIVAR_1.36)(64bit) libefivar.so.1(LIBEFIVAR_1.37)(64bit) libefivar.so.1(LIBEFIVAR_1.38)(64bit) libefivar.so.1(libefivar.so.0)(64bit) libefivar1 libefivar1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
