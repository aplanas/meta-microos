SUMMARY = "Bluetooth support for the PulseAudio sound server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
Contains Bluetooth audio (A2DP/HSP/HFP) support for the PulseAudio sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-bluetooth-16.1-3.1.aarch64.rpm"
RPM_HASH = "3b3f626cbc43fd6a54db94384731c5956c56baba35dae98bc319bd0f2f984dde6110287a86c2fcc16c498821a1b69b7c2cc8b17cb50af01458be29fca97cc740"

RPROVIDES:${PN} += "libbluez5-util.so()(64bit) pulseaudio-module-bluetooth pulseaudio-module-bluetooth(aarch-64)"
RDEPENDS:${PN} += "bluez ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libpulsecommon-16.1.so()(64bit) libpulsecore-16.1.so()(64bit) libsbc.so.1()(64bit) libsbc.so.1(SBC_1.0)(64bit) libsbc.so.1(SBC_1.1)(64bit) pulseaudio"

inherit rpm
