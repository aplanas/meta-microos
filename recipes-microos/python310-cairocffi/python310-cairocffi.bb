SUMMARY = "Python cairo bindings based on cffi"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python310-cairocffi-1.5.1-1.1.noarch.rpm"
RPM_HASH = "8a062a9800e931e128b54bbc55825dfd312b7d6b15cac1aa046d45fe8a4ee4baafc3cf208fd27a61a336371569f54c7fc7db72af8419c74891b741ae4096f70b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cairocffi python3.10dist(cairocffi) python310-cairocffi python3dist(cairocffi)"
RDEPENDS:${PN} += "cairo python(abi) python310-cffi python310-xcffib"

inherit rpm
