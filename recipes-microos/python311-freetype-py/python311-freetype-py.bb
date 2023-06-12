SUMMARY = "Freetype python bindings"
DESCRIPTION = "Freetype python provides bindings for the FreeType library. \
Only the high-level API is bound."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python311-freetype-py-2.3.0-1.3.noarch.rpm"
RPM_HASH = "ecf8fd4e320a66ed652cf6f32e2253724f7619b3684735736c25b09188501028d461b2ddf2645494e90ae397a251526f7e3a45258c01b6712b2df826ce486c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(freetype-py) \
python311-freetype-py \
python3dist(freetype-py)"
RDEPENDS:${PN} += "freetype2 \
python(abi)"

inherit rpm
