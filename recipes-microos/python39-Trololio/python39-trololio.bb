SUMMARY = "Trollius and asyncio compatibility library"
DESCRIPTION = "Trololio provides a compatibility layer for Trollius and asyncio (aka Tulip). \
It addresses the differences listed in Trollius and Tulip: \
 \
* Allows the use of Trollius' syntax with asyncio. \
* Provides missing objects and aliases for the others. \
* Synchronizes debug environnement variables."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python39-Trololio-1.0-3.14.noarch.rpm"
RPM_HASH = "23c836f98360e6ee8a839230b0ee9e652de0fe2024d5d9eb4f63d05f3a1ab83e544035dde8f1da73953c03abb1e43ad23a94cc3360f65d46ce88efe099d16019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(trololio) python39-Trololio python3dist(trololio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
