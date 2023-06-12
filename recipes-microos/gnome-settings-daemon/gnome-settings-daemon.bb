SUMMARY = "Settings daemon for the GNOME desktop"
DESCRIPTION = "gnome-settings-daemon provides a daemon run by all GNOME sessions to \
provide live access to configuration settings and the changes done to \
them as well as basic services like a clipboard manager, controlling \
the startup of the screensaver, etc. \
 \
This module was previously part of GNOME Control Center, but has been \
split for a more general use."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "44.1"

RPM_NAME = "gnome-settings-daemon-44.1-1.1.aarch64.rpm"
RPM_HASH = "2d6bc8011e62d36d312d2a1db4d99d85022fc9ca817a4e9f8ecbd11570bfab577356d29bc742cc7527e02483890523cdac19a96e2c65283707b4152ed0e3fc42"

RPROVIDES:${PN} += "gnome-settings-daemon \
gnome-settings-daemon(aarch-64) \
libgsd.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkexec \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libcolord.so.2()(64bit) \
libcups.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libgcr-4.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgeoclue-2.so.0()(64bit) \
libgeocode-glib-2.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libgweather-4.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmm-glib.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnotify.so.4()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.12.5)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.9.3)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libupower-glib.so.3()(64bit) \
libwacom.so.9()(64bit) \
libwacom.so.9(LIBWACOM_2.0)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
