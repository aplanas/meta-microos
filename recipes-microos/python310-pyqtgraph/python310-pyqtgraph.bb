SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "python310-pyqtgraph-0.12.4-1.2.noarch.rpm"
RPM_HASH = "ee76ce0e931b512e8f74e9cc3f24bccfa57b68c806ee3be597077137abaa5a94bfb995fa9266feff0031c21692c177ac2a36b1a8331759860bdf5fbe494c748d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyqtgraph \
python3.10dist(pyqtgraph) \
python310-pyqtgraph \
python3dist(pyqtgraph)"
RDEPENDS:${PN} += "(python310-qt5 >= 5.12 or python310-PyQt6 >= 6.1 or python3-pyside2 >= 5.12) \
python(abi) \
python310-numpy"

inherit rpm
