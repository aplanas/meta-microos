SUMMARY = "Window Navigator Construction Kit -- Tools"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs. \
 \
This package provides some utilities based on libwnck."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "libwnck-tools-43.0-3.3.aarch64.rpm"
RPM_HASH = "d720417800644f4038ad5b5a9876b732e1656ddfe1dbf02f488232ba19295efb84950213aa6997bc14050f35ade3ed54224eee6d79f2c8e7411aea0a6ef8a009"

RPROVIDES:${PN} += "libwnck-tools libwnck-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libwnck-3.so.0()(64bit)"

inherit rpm
