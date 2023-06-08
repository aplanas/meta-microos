SUMMARY = "Toolkit to write Gtk+3-based frontends to libretro"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications such as \
GNOME Games."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "retro-gtk-1.0.2-2.7.aarch64.rpm"
RPM_HASH = "8ba58199318f8069fbebd8afbb9136a14e3371a976860110f5408e1f8b922e88f2bc440d7d5fa4ea40023c9ef9223248b773db76eb942dd5d9d9cea4f1388237"

RPROVIDES:${PN} += "retro-gtk retro-gtk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libepoxy.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsamplerate.so.0()(64bit) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) libsamplerate.so.0(libsamplerate.so.0.1)(64bit)"

inherit rpm
