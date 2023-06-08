SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python39-mergedeep-1.3.4-2.8.noarch.rpm"
RPM_HASH = "2ea9d523b0008df64acdc715a158ff5b6a00bf919110a51f79bc9ebb15e5dfbcc7cb5d9349d75c69f97064e932aa80d5516ceea40dc92d50d1bde65916af8a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mergedeep) python39-mergedeep python3dist(mergedeep)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
