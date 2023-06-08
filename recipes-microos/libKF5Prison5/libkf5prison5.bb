SUMMARY = "Barcode abstraction layer library"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.105.0"

RPM_NAME = "libKF5Prison5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "b8e1c7eec7ecfc9ca5de8a301aa7b6c83182203f007925e61f226cbbb3690d385f93c03eac287572cddf8d5c65553ac635270c4ea81a76e125af0df545ba8db5"

RPROVIDES:${PN} += "libKF5Prison.so.5()(64bit) libKF5Prison5 libKF5Prison5(aarch-64) libKF5PrisonScanner.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libZXing.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libdmtx.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libqrencode.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
