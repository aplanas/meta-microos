SUMMARY = "Osmocom GSM utility library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmogsm library in particular is a collection of common code \
used in various GSM related sub-projects inside the Osmocom family of \
projects. It includes A5/1 and A5/2 ciphers, COMP148v1, a LAPDm \
implementation, a GSM TLV parser, SMS utility routines as well as \
protocol definitions for a series of protocols."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmogsm18-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "a9a4220dcefe3dd89be8369ca7c7cc48cb6ca74b8205fff085dd98fc95d88b12272e633277c3eabe86fc2d70b199f0c68503e6e1a1d7428a83e9ffec94648bc0"

RPROVIDES:${PN} += "libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmogsm18 libosmogsm18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
