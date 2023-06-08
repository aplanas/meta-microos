SUMMARY = "A caching front-end based on the Dogpile lock"
DESCRIPTION = "A caching API built around the concept of a 'dogpile lock', which allows \
continued access to an expiring data value while a single thread generates a \
new value."
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python3-dogpile.cache-1.1.8-1.3.noarch.rpm"
RPM_HASH = "eb8f0b3c6d6abc80316bd4cce313b5daf6974ccd117bceb792f95ba2fb1ffdfcdb71f987d06cb4dbd15a0c7ab65ea3a265c0134e680d4f43758b25ebf6415ada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dogpile.cache python3-dogpile.core python3.10dist(dogpile.cache) python3dist(dogpile.cache)"
RDEPENDS:${PN} += "python(abi) python3-decorator python3-stevedore"

inherit rpm
