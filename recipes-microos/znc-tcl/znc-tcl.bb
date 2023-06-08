SUMMARY = "TCL support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Tcl extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-tcl-1.8.2-3.6.aarch64.rpm"
RPM_HASH = "735e5f4e218581b784d9cf6c2f1e69de637d967cc7c8d07a77149dee147e98900f67db82274674e5c40fa85beab0a1fca0ea17565374cb7df924c88087931b48"

RPROVIDES:${PN} += "znc-tcl znc-tcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtcl8.6.so()(64bit) tcl znc"

inherit rpm
