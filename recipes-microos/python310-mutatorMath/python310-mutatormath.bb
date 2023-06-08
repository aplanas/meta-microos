SUMMARY = "Calculation of piecewise linear interpolations in multiple dimensions"
DESCRIPTION = "MutatorMath is a Python library for the calculation of piecewise linear \
interpolations in n-dimensions with any number of masters. It was \
developed for interpolating data related to fonts, but if can handle any \
arithmetic object."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-mutatorMath-3.0.1-4.7.noarch.rpm"
RPM_HASH = "a61898642fc8ee3da044ef640529578880305d5c5cddf78fc4da1a0ade3e88faf2862d5c014d0f268613897c2aea08de41429d04631b17078911b34a2264b5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutatorMath python3.10dist(mutatormath) python310-mutatorMath python3dist(mutatormath)"
RDEPENDS:${PN} += "python(abi) python310-FontTools python310-defcon python310-fontMath python310-fs"

inherit rpm
