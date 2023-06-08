SUMMARY = "Symbolic constants in Python"
DESCRIPTION = "A library that provides symbolic constant support. \
It includes collections and constants with text, numeric, and bit flag values. \
Originally ``twisted.python.constants`` from the `Twisted <https://twistedmatrix.com/>`_ project."
LICENSE = "MIT"

PV = "15.1.0"

RPM_NAME = "python39-constantly-15.1.0-3.1.noarch.rpm"
RPM_HASH = "fbc07a8849c40b32088556273e362e35807c74baa93181d5523bfd491b86e05ea0ef7e54303cc3086aafb30d3c03a3767ecb2aef3643bb96ddd78572a79660ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(constantly) python39-constantly python3dist(constantly)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
