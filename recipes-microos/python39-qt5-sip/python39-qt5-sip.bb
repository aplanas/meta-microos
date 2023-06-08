SUMMARY = "The sip module support for PyQt5"
DESCRIPTION = "The sip extension module provides support for the PyQt5 package. \
 \
SIP is a tool that makes it very easy to create Python bindings for \
C and C++ libraries. It was originally developed to create PyQt, \
the Python bindings for the Qt toolkit, but can be used to create \
bindings for any C or C++ library. For example, it is also used to \
create wxPython, the Python bindings for the wxWidget toolkit."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "12.12.1"

RPM_NAME = "python39-qt5-sip-12.12.1-1.1.aarch64.rpm"
RPM_HASH = "a175b50243d814ec803e781da7d4c9c782d633a8944b5941777c35f9903126f50044323c85c06c01698650bb9ca461b2d5ff13433e5a24c2e07a86f999b7f9fb"

RPROVIDES:${PN} += "python3.9dist(pyqt5-sip) python39-PyQt5-sip python39-qt5-sip python39-qt5-sip(aarch-64) python3dist(pyqt5-sip)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
