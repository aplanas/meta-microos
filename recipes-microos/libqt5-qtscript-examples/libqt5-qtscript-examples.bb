SUMMARY = "Qt5 Script examples"
DESCRIPTION = "Examples for libqt5-qtscript module."
LICENSE = "BSD-3-Clause"

PV = "5.15.12"

RPM_NAME = "libqt5-qtscript-examples-5.15.12-2.3.aarch64.rpm"
RPM_HASH = "0eeab16da9b59ccce1879d1d732d83e783160cb1a8868e217b0962659cfaaa042450110012162b7ccdca3c23eabd4f71370694d0f516599907932dfac4bdeda3"

RPROVIDES:${PN} += "libqt5-qtscript-examples libqt5-qtscript-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Script.so.5()(64bit) libQt5Script.so.5(Qt_5)(64bit) libQt5ScriptTools.so.5()(64bit) libQt5ScriptTools.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
