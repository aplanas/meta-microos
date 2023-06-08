SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Vala is an object-oriented programming language with a self-hosting \
compiler that generates C code and uses the GObject system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "vala-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "96ac886ef3a0c112025af86a0ed0c78d1780b226d3eeca8d7093190f1c107229bbf585e6dfb427ace5d2b09ae5d2b5bba18da40cd1f583775faeb44b3995b513"

RPROVIDES:${PN} += "libvalaccodegen.so()(64bit) pkgconfig(vapigen) pkgconfig(vapigen-0.56) vala vala(aarch-64) vala-devel"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libvala-0.56.so.0()(64bit) update-alternatives"

inherit rpm
