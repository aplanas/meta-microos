SUMMARY = "Python Bindings for the Thunar Extension Framework"
DESCRIPTION = "This package provides the Python bindings for the Thunar Extension framework \
which allow one to create Python plugins for Thunar."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "thunarx-python-0.5.2-1.12.aarch64.rpm"
RPM_HASH = "7f01e26b01d57e53855e3aca71b69de8e550a7ed76a8f9910cf177df60e03b3574e71af93cb9681389bb475e9439481087daca14e664a9260dea1d017b2d75fa"

RPROVIDES:${PN} += "thunarx-python thunarx-python(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpython3.10.so.1.0()(64bit) libthunarx-3.so.0()(64bit) thunar"

inherit rpm
