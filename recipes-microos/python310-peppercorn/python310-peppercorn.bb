SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python310-peppercorn-0.6-4.1.noarch.rpm"
RPM_HASH = "45a4b0d8eb586f74b29a192b9d0d3525fa60770188f3d0a4ba48d16b2fdd7e88459d446446895cde0e8e70e41af3a837991b321473af3b845b7e9343f54b2ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-peppercorn python3.10dist(peppercorn) python310-peppercorn python3dist(peppercorn)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
