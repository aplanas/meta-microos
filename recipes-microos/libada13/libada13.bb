SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.0.1+git7231"

RPM_NAME = "libada13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "0ebd4d6418522e5b57c36d55ca4bb4f7b439aaafb493d2739409303e871853d46ca81e5da441057a59a210ac5f7f7166430db2fb7755c71bda6af8e577eb0663"

RPROVIDES:${PN} += "libada13 libada13(aarch-64) libgnarl-13 libgnarl-13.so()(64bit) libgnat-13 libgnat-13.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
