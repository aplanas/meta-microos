SUMMARY = "A python3-traits enabled version of python3-vtk"
DESCRIPTION = "TVTK wraps VTK objects to provide a convenient, Pythonic API, while \
supporting Traits attributes and NumPy/SciPy arrays. TVTK is \
implemented mostly in pure Python, except for a small extension module. \
 \
Developers typically use TVTK to write Mayavi modules, and then use \
Mayavi to interact with visualizations or create applications. \
 \
It is part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "4.7.4"

RPM_NAME = "python3-tvtk-4.7.4-1.7.aarch64.rpm"
RPM_HASH = "8ac60ca98fedd31f3c6373dfd59ca4144cc6337e172437629032bee3ce3e3ea183e4a7f2cf712aab78491cdbde0f53e9036f4cb2e46192f263f542cdbeb63cc6"

RPROVIDES:${PN} += "application() application(tvtk_doc.desktop) python3-tvtk python3-tvtk(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python3-numpy python3-pyface python3-traits python3-traitsui python3-vtk"

inherit rpm
