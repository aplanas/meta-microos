SUMMARY = "VNC Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-vnc-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "826ff5444a1bc068f490e6d8b81bed98a35a649645c7de2c1a39aafbc163ce2ff5526ee27711117af941fb060dd40619aff06f5da8ec33507289b141e175e922"

RPROVIDES:${PN} += "remmina-plugin-vnc remmina-plugin-vnc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libvncclient.so.1()(64bit) remmina"

inherit rpm
