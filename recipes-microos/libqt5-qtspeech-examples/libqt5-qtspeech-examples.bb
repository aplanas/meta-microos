SUMMARY = "Qt5 Speech examples"
DESCRIPTION = "Examples for the libqt5-qtspeech module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtspeech-examples-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "ff82097043673a4b3c512361f737fd25c7a5b7583e97329351e5e77853f5781c1761067082f305d65def928b4ce97abec685c4cec9bf4f49ba1ac3761a6ed238"

RPROVIDES:${PN} += "libqt5-qtspeech-examples libqt5-qtspeech-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5TextToSpeech.so.5()(64bit) libQt5TextToSpeech.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
