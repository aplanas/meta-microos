SUMMARY = "Thunar Extension Library"
DESCRIPTION = "This package contains the Thunar extension library."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.6"

RPM_NAME = "libthunarx-3-0-4.18.6-1.1.aarch64.rpm"
RPM_HASH = "20c837899700188af9452fdfd6cf4d6fba9a19059c92db48da5d6f65e52d1cdfe07744bd73c7f322efbb3bcfc46b0fbc1b80b4a28f641af67f65dc2c6cb64976"

RPROVIDES:${PN} += "libthunarx-3-0 libthunarx-3-0(aarch-64) libthunarx-3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
