SUMMARY = "Tools for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-tools-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "b1052bf5999374b9bc40f31e42fff3809e002e2a5c488b33e569456fae4bd35226e7d60c5355753ba601e344904ab30779b05b788403ec20dfb76ea94f052eba"

RPROVIDES:${PN} += "gwenhywfar-tools \
gwenhywfar-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgwenhywfar.so.79()(64bit) \
libgwenhywfar79 \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
