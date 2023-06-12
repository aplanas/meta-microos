SUMMARY = "Qt 6 Tool used by Qt to generate documentation"
DESCRIPTION = "Qt 6 Tool used by Qt to generate documentation."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-tools-qdoc-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1328626a4bdf48149e5ff9be7d0d52edce2beb8bcda4ceb71fa8b18a2d7dbfb7cbff73da203208c314d08f93226c35c42aa7616ec66f806dc5fc80624c121721"

RPROVIDES:${PN} += "qt6-tools-qdoc qt6-tools-qdoc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang.so.13()(64bit) libclang.so.13(LLVM_13)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm
