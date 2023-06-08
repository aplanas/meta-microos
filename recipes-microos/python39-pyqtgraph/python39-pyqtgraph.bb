SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "python39-pyqtgraph-0.12.4-1.2.noarch.rpm"
RPM_HASH = "598c3225eab78a77494e6a2167cc2db2ea6ded57aa66fe57a56006fd46cd7b8bd7746b8ec49ccd33be11a12fae5f1e42bee5bda8a6e2342d06981c13a63a39a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyqtgraph) python39-pyqtgraph python3dist(pyqtgraph)"
RDEPENDS:${PN} += "(python39-qt5 >= 5.12 or python39-PyQt6 >= 6.1) python(abi) python39-numpy"

inherit rpm
