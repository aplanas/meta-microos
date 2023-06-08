SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libada11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "7e175b4f583b5bea0591d4b7d3fdbe30b6e1d9ae9ae6b4bc7ef5de7c92e5f0f80b681a0375ebd8c12d5188da7a55ad891f690a0b21ddc639f1c974680d6e36a8"

RPROVIDES:${PN} += "libada11 libada11(aarch-64) libgnarl-11 libgnarl-11.so()(64bit) libgnat-11 libgnat-11.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
