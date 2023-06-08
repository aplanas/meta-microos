SUMMARY = "Library with common API for various MATE modules"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "mate-desktop-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "df60ecb7ca272125080185d38ab1d5c1f35e2d1c2ed4f82724f036871dae43c1942ca372e20ad678d36f23a638f426bb5cd5b7181c7ce474d6766f980fce6f41"

RPROVIDES:${PN} += "application() application(mate-about.desktop) application(mate-color-select.desktop) mate-desktop mate-desktop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmate-desktop-2.so.17()(64bit) xdg-user-dirs"

inherit rpm
