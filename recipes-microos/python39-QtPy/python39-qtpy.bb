SUMMARY = "Abstraction layer on top of Qt bindings"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
It provides support for PyQt5, PyQt6, PySide6, PySide2 using the Qt5 \
layout (where the QtGui module has been split into QtGui and QtWidgets). \
Basically, you can write your code as if you were using PyQt or PySide \
directly, but import Qt modules from qtpy instead of PyQt5, PySide2, \
PyQt6 or PySide6."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-QtPy-2.3.0-1.4.noarch.rpm"
RPM_HASH = "fb4ca747f27b19bbeb790c255598ee29ffc5f331addc561bf9f4a233efc053f06bdf1286818dde4e13462228dc3d70c877b32b10f23af5ecc612281c0038c9e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(qtpy) python39-QtPy python3dist(qtpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-packaging update-alternatives"

inherit rpm
