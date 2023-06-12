SUMMARY = "Osmo ISDN utility library"
DESCRIPTION = "The libosmocore library contains various utility functions, a \
collection of common code used in various ISDN related sub-projects \
inside the Osmocom family of projects. It includes an I.460 \
sub-channel multiplex and a generic LAPD core."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmoisdn0-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "72e74d9ab8362626653fd33ecc85d508417012dc7dc541eabe9982fd13c2cdc6bb9fa414ea01e2bdfa547fdf015b39330d5389083159e61bc22f15196773efa8"

RPROVIDES:${PN} += "libosmoisdn.so.0()(64bit) libosmoisdn.so.0(LIBOSMOISDN_1.0)(64bit) libosmoisdn0 libosmoisdn0(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.20()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
