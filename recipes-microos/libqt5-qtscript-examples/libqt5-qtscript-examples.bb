SUMMARY = "Qt5 Script examples"
DESCRIPTION = "Examples for libqt5-qtscript module."
LICENSE = "BSD-3-Clause"

PV = "5.15.12"

RPM_NAME = "libqt5-qtscript-examples-5.15.12-2.2.aarch64.rpm"
RPM_HASH = "55ef72efa008a6e2adc345221300e9a208e143a82364891a28997a588291855f9bea782706556fc80472ddc46b511d9cd644f28517abcc38adb0d47bb97a645d"

RPROVIDES:${PN} += "libqt5-qtscript-examples libqt5-qtscript-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Script.so.5()(64bit) libQt5Script.so.5(Qt_5)(64bit) libQt5ScriptTools.so.5()(64bit) libQt5ScriptTools.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
