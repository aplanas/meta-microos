SUMMARY = "Python bindings for the OpenShot library"
DESCRIPTION = "This package provides the Python bindings for the OpenShot library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python3-openshot-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "2ac2645fbac0cb952497c36d34507b326f03efe47873e7549c6fe8417c0fffda6ff2ea60d8e8f0b443557592ace7133095a8d5e4c4dc89407360b86a0f0c33c9"

RPROVIDES:${PN} += "python3-openshot python3-openshot(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjsoncpp.so.25()(64bit) libopenshot-audio.so.9()(64bit) libopenshot.so.24()(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
