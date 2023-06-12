SUMMARY = "Freetype python bindings"
DESCRIPTION = "Freetype python provides bindings for the FreeType library. \
Only the high-level API is bound."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python310-freetype-py-2.3.0-1.3.noarch.rpm"
RPM_HASH = "9341b2f139a27f190d5143dc07e3812bce40f5e3e06dd091c8434a7aa4d3c4e8ffe53c56ba24e743ed6316fac2aee8df3e53b28c21a6b36a933aa0054915d65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freetype-py \
python3.10dist(freetype-py) \
python310-freetype-py \
python3dist(freetype-py)"
RDEPENDS:${PN} += "freetype2 \
python(abi)"

inherit rpm
