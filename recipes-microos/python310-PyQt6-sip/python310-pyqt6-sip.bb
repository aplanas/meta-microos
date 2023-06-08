SUMMARY = "The sip module support for PyQt6"
DESCRIPTION = "The sip extension module provides support for the PyQt6 package. \
 \
SIP is a tool for automatically generating Python bindings for \
C and C++ libraries. SIP was originally developed in 1998 for \
PyQt - the Python bindings for the Qt GUI toolkit - but is \
suitable for generating bindings for any C or C++ library. SIP \
can also be used write self contained extension modules, i.e. \
without a library to be wrapped."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "13.5.1"

RPM_NAME = "python310-PyQt6-sip-13.5.1-1.1.aarch64.rpm"
RPM_HASH = "df989bb773576d75a57d369f4f870b342428d876bbbdc5b6c833513ec03e86e4ddf18a13d03dfc43dea5f4e002d88dbf217230356c9d99fc65afb6f7d95b2988"

RPROVIDES:${PN} += "python3-PyQt6-sip python3.10dist(pyqt6-sip) python310-PyQt6-sip python310-PyQt6-sip(aarch-64) python3dist(pyqt6-sip)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
