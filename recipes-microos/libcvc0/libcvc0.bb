SUMMARY = "LibCVC API"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.6.2"

RPM_NAME = "libcvc0-5.6.2-1.1.aarch64.rpm"
RPM_HASH = "119e21810d2294c148716f63ec755393c7f07dd2ae88a0f771034ff71f6a50c04d7b78aebd6ec0e1e48b3a2644bc5e705511fbdcf4711334ad67b0466f4d800a"

RPROVIDES:${PN} += "libcvc.so.0()(64bit) libcvc0 libcvc0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpulse-mainloop-glib.so.0()(64bit) libpulse-mainloop-glib.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
