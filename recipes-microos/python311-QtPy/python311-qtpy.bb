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

RPM_NAME = "python311-QtPy-2.3.0-1.4.noarch.rpm"
RPM_HASH = "10f08c378a9339df3875f47faf49fadca07680ba73641560967ef842b545a18f696cac38122b864c0b99c63cbe763bde91b6d002917e6d0b33307fe8ac4ada1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(qtpy) python311-QtPy python3dist(qtpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-packaging update-alternatives"

inherit rpm
