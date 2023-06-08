SUMMARY = "Python support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Python extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-python3-1.8.2-3.6.aarch64.rpm"
RPM_HASH = "1f7670e54493518f5df295fe3ffb6345a6f8ea6b98cda45f686965c9e33d8130b68ea2c4a57a985164a461ff56c78b489284860469cdb7cc08f1a7bbfcf316f9"

RPROVIDES:${PN} += "znc-python znc-python3 znc-python3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python3 znc"

inherit rpm
