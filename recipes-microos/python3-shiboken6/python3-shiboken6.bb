SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "python3-shiboken6-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "e23dbd4705f9dfd04314cf51d5d0e209e796682bffc79fc3a2f7de84fcb7442393f9b04bf295668e76b17f2dee6e5d9725d1874e22a5e892bbcb1d1052e3c5da"

RPROVIDES:${PN} += "libshiboken6.abi3.so.6.5()(64bit) python3-shiboken6 python3-shiboken6(aarch-64) python3.10dist(shiboken6) python3dist(shiboken6)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/python3 libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang.so.13()(64bit) libclang.so.13(LLVM_13)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.1.18)(64bit) python(abi)"

inherit rpm
