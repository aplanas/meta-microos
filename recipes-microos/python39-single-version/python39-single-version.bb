SUMMARY = "Have a single source of version in your code base"
DESCRIPTION = "Utility to let you have a single source of version in your code base."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-single-version-1.5.1-1.10.noarch.rpm"
RPM_HASH = "a30e43df1561c4afc8e48978bfd3b2a3ae326327f6d4f94ded798bfe5478872567b6bdf5c5d6d0d11177c3c4eaf9fe972cbc9805b79b1cbd2c2b8dc5a3eac28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(single-version) python39-single-version python3dist(single-version)"
RDEPENDS:${PN} += "python(abi) python39-first python39-importlib-metadata"

inherit rpm
