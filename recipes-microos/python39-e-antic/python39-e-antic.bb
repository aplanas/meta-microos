SUMMARY = "Real Embedded Algebraic Number Theory in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "python39-e-antic-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "7848f4cbf39c36b52e51383fcc62786a58f44c0d78b5e66158cab22a0afb110116d3bda0475ba5386229ce620e0d7e12597d30c28555d74eaf9334687b1622ba"

RPROVIDES:${PN} += "python3.9dist(pyeantic) python39-e-antic python39-e-antic(aarch-64) python39-pyeantic python3dist(pyeantic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
