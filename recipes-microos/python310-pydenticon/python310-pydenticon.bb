SUMMARY = "Library for generating identicons"
DESCRIPTION = "Pydenticon is a small utility library that can be used for deterministically \
generating identicons based on the hash of provided data. \
 \
The implementation is a port of the Sigil identicon implementation from: \
 \
* https://github.com/cupcake/sigil/ \
 \
Pydenticon provides a couple of extensions of its own when compared to the \
original Sigil implementation, like: \
 \
* Ability to supply custom digest algorithms (allowing for larger identicons if \
  digest provides enough entropy). \
* Ability to specify a rectangle for identicon size.."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "python310-pydenticon-0.3.1-5.6.noarch.rpm"
RPM_HASH = "67fc8f73af3a2f7a013f4daee23f2a52bfdc83ecc0f04579f3d7b702e67cc6c197f031010f6ec074dbb3b955d0be4414f52527e5517964ad5f8a76dd9bbc9923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydenticon python3.10dist(pydenticon) python310-pydenticon python3dist(pydenticon)"
RDEPENDS:${PN} += "python(abi) python310-Pillow"

inherit rpm
