SUMMARY = "MIME Parser and Utility Library"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.13"

RPM_NAME = "libgmime-3_0-0-3.2.13-1.1.aarch64.rpm"
RPM_HASH = "257d37e321f3695a4dd10ab2c57e76ec9e08145c57022ef5f27656fdfb6e97fe871ccf2c4266d1799b9cbd7a5da264a5e43bcaa1222832271ed7094b8e67b309"

RPROVIDES:${PN} += "libgmime-3.0.so.0()(64bit) libgmime-3_0-0 libgmime-3_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libidn2.so.0()(64bit) libidn2.so.0(IDN2_0.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
