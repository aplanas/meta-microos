SUMMARY = "SvxLink - A general purpose voice services system"
DESCRIPTION = "The SvxLink server is a general purpose voice services system for ham radio use. \
Each voice service is implemented as a plugin called a module. Some examples of \
voice services are: Help system, Simplex repeater, EchoLink connection. \
 \
The core of the system handle the radio interface and is quite flexible as well. \
It can act both as a simplex node and as a repeater controller."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "svxlink-server-1.5.0-5.9.aarch64.rpm"
RPM_HASH = "9a7eaf805e9166f08de06e5c09abac8c68acf192aeb345262b2f22982bf23ea5e3c3c59b642dc4cb7c1c10c2254fb4150e3cc6e63046f348e15beda29014a379"

RPROVIDES:${PN} += "config(svxlink-server) \
svxlink-server \
svxlink-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasyncaudio.so.1.6()(64bit) \
libasynccore.so.1.6()(64bit) \
libasynccpp.so.1.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libecholib.so.1.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgsm.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtcl8.6.so()(64bit) \
logrotate \
shadow"

inherit rpm
