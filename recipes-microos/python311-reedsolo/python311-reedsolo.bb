SUMMARY = "Pure-Python Reed Solomon encoder/decoder"
DESCRIPTION = "A pure-python universal errors-and-erasures Reed-Solomon Codec, based on the wonderful tutorial at Wikiversity, \
written by 'Bobmath' and 'LRQ3000'. If you are just starting with Reed-Solomon error correction codes, \
the Wikiversity article is a good beginner's introduction. This is a burst-type implementation, \
so that it supports any Galois field higher than 2^3, but not binary streams."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-reedsolo-1.6.0-1.3.noarch.rpm"
RPM_HASH = "70e039e214b7636f53fa85291038e036f66bcdb7ecce5ba10166e0be4208ae992edb8b396467b256939691b286d859be9cf334afc490ff82ecc1176f311643c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(reedsolo) python311-reedsolo python3dist(reedsolo)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
