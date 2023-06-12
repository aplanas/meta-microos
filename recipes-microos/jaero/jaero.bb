SUMMARY = "A SatCom ACARS demodulator and decoder for the Aero standard"
DESCRIPTION = "JAERO is a program that demodulates and decodes Classic Aero ACARS (Aircraft \
Communications Addressing and Reporting System) messages sent from satellites to \
aeroplanes (SatCom ACARS), commonly used when planes are beyond VHF range. \
 \
Demodulation is performed using the soundcard. \
 \
Such signals are typically around 1.5Ghz and can be received with a \
low-gain antenna that can be home-brewed in conjunction with an \
RTL-SDR dongle."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "1.0.4.13"

RPM_NAME = "jaero-1.0.4.13-1.9.aarch64.rpm"
RPM_HASH = "8d5f97fbd0fa5c6869aa2b75b5cfe1ac8dc6fe72c5c5a15b78efed209eb96458674da7eb6bd708290d6d29d620e8cf1a6d4ee450684341594f3b06eb1bd259bc"

RPROVIDES:${PN} += "application() \
application(jaero.desktop) \
jaero \
jaero(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libacars.so.1()(64bit) \
libacars.so.1(ACARS_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcorrect.so.0.0.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libogg.so.0()(64bit) \
libqcustomplot.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libzmq.so.5()(64bit) \
unzip"

inherit rpm
