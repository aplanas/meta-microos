SUMMARY = "GNU Radio examples"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains some examples of using GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.6.0"

RPM_NAME = "gnuradio-examples-3.10.6.0-4.2.aarch64.rpm"
RPM_HASH = "3d1bb74f8e3d5472e34af34762f65694bf33fa5d6667e9e863d458485bb2c72c3e7ea3ba059958783a89fe108c8bc4cf01b97318248a992127791d91304854ff"

RPROVIDES:${PN} += "gnuradio-examples gnuradio-examples(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 gnuradio ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libboost_program_options.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfmt.so.9()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgnuradio-analog.so.3.10.6()(64bit) libgnuradio-audio.so.3.10.6()(64bit) libgnuradio-blocks.so.3.10.6()(64bit) libgnuradio-pmt.so.3.10.6()(64bit) libgnuradio-qtgui.so.3.10.6()(64bit) libgnuradio-runtime.so.3.10.6()(64bit) libgnuradio-uhd.so.3.10.6()(64bit) libspdlog.so.1.11()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuhd.so.4.4.0()(64bit)"

inherit rpm
