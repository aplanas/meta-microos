SUMMARY = "MATE Desktop panel applet to display sensor readings"
DESCRIPTION = "MATE Sensors Applet is an applet for the MATE Panel to display \
readings from hardware sensors, including CPU temperature, fan \
speeds and voltage readings under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-applet-sensors-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "4a31e6c9d5c486177d216e56c48e16c21b4e378dd4041a613dff92cc993d6080ed9c0db4f6fcef60e2fa047615b177baf7ca134f1088210030fb79bf5b2316fe"

RPROVIDES:${PN} += "libacpi.so()(64bit) libhddtemp.so()(64bit) libi8k.so()(64bit) libibm-acpi.so()(64bit) liblibsensors.so()(64bit) libmbmon.so()(64bit) libomnibook.so()(64bit) libpmu-sys.so()(64bit) libsmu-sys.so()(64bit) libsonypi.so()(64bit) libudisks2.so()(64bit) mate-applet-sensors mate-applet-sensors(aarch-64) mate-sensors-applet"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmate-panel-applet-4.so.1()(64bit) libmate-sensors-applet-plugin.so.0()(64bit) libnotify.so.4()(64bit) libsensors.so.4()(64bit) mate-panel"

inherit rpm
