SUMMARY = "Cute little penguins that walk along the tops of your windows"
DESCRIPTION = "This program animates a friendly family of penguins on your root \
window. They drop in from the top of the screen, walk along the tops of \
your windows, up the sides of your windows, up the side of the screen, \
and sometimes even levitate with their genetically-modified \
go-go-gadget 'copter ability."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "xpenguins-3.2.1-1.8.aarch64.rpm"
RPM_HASH = "0f3c094e0902182ad024b36e9ab0957dbe60e3a0ff59397fcfa3d950fa256c00c5ed3ce0e97ff5d88b2ba26bd5da8578678c2b9f6350566e16e07f45c3ca1786"

RPROVIDES:${PN} += "application() application(xpenguins-stop.desktop) application(xpenguins.desktop) xpenguins xpenguins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXpm.so.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
