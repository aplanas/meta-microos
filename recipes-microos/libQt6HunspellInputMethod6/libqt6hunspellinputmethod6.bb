SUMMARY = "Qt 6 HunspellInputMethod private library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6HunspellInputMethod6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "af102cccb27fd8c1c53f793715cda17cc2e2d0bc8d52867abaa92bd5a7e87f7a10c6f6e368d33c5a9febdacff4452e394ccf45ee77dade4ccf3607206ac943d9"

RPROVIDES:${PN} += "libQt6HunspellInputMethod.so.6()(64bit) libQt6HunspellInputMethod.so.6(Qt_6)(64bit) libQt6HunspellInputMethod.so.6(Qt_6.0)(64bit) libQt6HunspellInputMethod.so.6(Qt_6.1)(64bit) libQt6HunspellInputMethod.so.6(Qt_6.2)(64bit) libQt6HunspellInputMethod.so.6(Qt_6.3)(64bit) libQt6HunspellInputMethod.so.6(Qt_6.4)(64bit) libQt6HunspellInputMethod.so.6(Qt_6.5)(64bit) libQt6HunspellInputMethod.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6HunspellInputMethod6 libQt6HunspellInputMethod6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6VirtualKeyboard.so.6()(64bit) libQt6VirtualKeyboard.so.6(Qt_6)(64bit) libQt6VirtualKeyboard.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhunspell-1.7.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
