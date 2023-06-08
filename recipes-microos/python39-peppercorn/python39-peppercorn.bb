SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python39-peppercorn-0.6-3.14.noarch.rpm"
RPM_HASH = "7d972301c687c183a43c0c7b8a0954c5f0564fee03b7f410a7a7ef91c6f9c5297ee1acd39043dde405426f49f82dbeecced7f635bf685644a281e57d4acf5abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(peppercorn) python39-peppercorn python3dist(peppercorn)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
