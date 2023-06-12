SUMMARY = "Implementation of Microsoft's NTLMv1 authentication"
DESCRIPTION = "Libntlm provides routines to manipulate the structures used for the \
client end of Microsoft NTLMv1 authentication."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libntlm0-1.6-2.1.aarch64.rpm"
RPM_HASH = "b2c8e70688bc0f674d32ed0435bfc2b4e7088ed66166ffb6d8fbd8888dead8470e55aafec465ef3915937cfee07a03dacdcb0e43643de444ef0d678505acc3b3"

RPROVIDES:${PN} += "libntlm.so.0()(64bit) libntlm0 libntlm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
