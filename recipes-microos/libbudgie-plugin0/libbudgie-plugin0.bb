SUMMARY = "Shared library for Budgie plugins"
DESCRIPTION = "Shared library for budgie plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "libbudgie-plugin0-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "e5effc455c008249624e1cd0ca178dd4f06ca5fc3cdb7b2191211a12136c8b857eb2743e7693142ab4df9c6f4aa623811dc8863320cc42e2f6030805e6e470f7"

RPROVIDES:${PN} += "libbudgie-plugin.so.0()(64bit) libbudgie-plugin0 libbudgie-plugin0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpeas-1.0.so.0()(64bit)"

inherit rpm
