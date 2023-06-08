SUMMARY = "Real Embedded Algebraic Number Theory in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "python311-e-antic-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "7fa00ab5efc90bc26d203488790349b8148a6863133a59e32d20f01026969a2070080641b85d11bacf0098d2c3b6b92ee4e47fd06f263b98d4d2eb78e21113aa"

RPROVIDES:${PN} += "python3.11dist(pyeantic) python311-e-antic python311-e-antic(aarch-64) python311-pyeantic python3dist(pyeantic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
