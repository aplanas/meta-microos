SUMMARY = "Library to crack passwords using dictionaries"
DESCRIPTION = "CrackLib tests passwords to determine whether they match \
certain security-oriented characteristics. You can use CrackLib to \
stopusers from choosing passwords that are too simple.This package \
contains a full dictionary file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.8"

RPM_NAME = "libcrack2-2.9.8-1.2.aarch64.rpm"
RPM_HASH = "a21cfc157ae22b79ab5dc6d9f10a50b91bea9c24a7011ac5bf1facc076ff20afd7983f213dc008989653b12eada5a2114591457bdb3d1d3f3892ef2b1660a15d"

RPROVIDES:${PN} += "libcrack.so.2()(64bit) libcrack2 libcrack2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig cracklib ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libz.so.1()(64bit)"

inherit rpm
