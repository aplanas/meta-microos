SUMMARY = "Client interface library for tpm2-abrmd"
DESCRIPTION = "This library allows to interact with the tpm2-abrmd daemon. It is intended for \
use with the SAPI library (libtss2-sys) like any other TCTI."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "libtss2-tcti-tabrmd0-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "de9b1070b14d83c45020499b369d838b4cf5fcc7a697400c3fc0a937456bf2af2103049f0565c9ee5731d28cfa82d836252562c68af409a87e73ae128545ff86"

RPROVIDES:${PN} += "libtss2-tcti-tabrmd.so.0()(64bit) libtss2-tcti-tabrmd0 libtss2-tcti-tabrmd0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtss2-mu.so.0()(64bit) libtss2-rc.so.0()(64bit) libtss2-sys.so.1()(64bit) libtss2-tctildr.so.0()(64bit)"

inherit rpm
