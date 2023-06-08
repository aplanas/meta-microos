SUMMARY = "Libproxy module to support WPAD/PAC parsing via the WebKit JavaScript Engine"
DESCRIPTION = "A module to extend libproxy with capabilities to pass addresses to a \
WPAD/PAC script and have it find the correct proxy. \
 \
Relies on tuktape to do the javascript parsing"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-pacrunner-duktape-0.4.18-1.6.aarch64.rpm"
RPM_HASH = "c22699d4c67a7c44e91c07d0a568554ef9e9da69dc2e6bf30162bed1e66531cbc258529e20044f1b32f8c440a5f1a8b7430a3a882b4a62765251f6805e0ea44f"

RPROVIDES:${PN} += "libproxy1-pacrunner libproxy1-pacrunner-duktape libproxy1-pacrunner-duktape(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libduktape.so.207()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libproxy.so.1()(64bit) libproxy1 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
