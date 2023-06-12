SUMMARY = "Libcap utility programs"
DESCRIPTION = "This package contains utility programs handling capabilities via \
libcap."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.69"

RPM_NAME = "libcap-progs-2.69-1.1.aarch64.rpm"
RPM_HASH = "2c4ea196d28b3ea4875f1a8859d942c83353d6ee4e64e242ff677e94e2dfe10df52d4dcdcf2c14b6554f7dc15b8ac16cf2c5bea0690390fd58e1021863e7e797"

RPROVIDES:${PN} += "libcap-progs libcap-progs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcap2"

inherit rpm
