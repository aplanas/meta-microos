SUMMARY = "Qt 6 Tool used by Qt to generate documentation"
DESCRIPTION = "Qt 6 Tool used by Qt to generate documentation."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-tools-qdoc-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "cd3241e28cfd0917870808ca02fe14d0ebc529bccbaf91e2b374949200c2ba0669aea574e3199d30381d350b0fc4a5702c5c63021626bee943f240d3e17a9576"

RPROVIDES:${PN} += "qt6-tools-qdoc qt6-tools-qdoc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang.so.13()(64bit) libclang.so.13(LLVM_13)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
