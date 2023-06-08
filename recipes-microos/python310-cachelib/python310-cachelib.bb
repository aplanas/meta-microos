SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python310-cachelib-0.10.2-1.3.noarch.rpm"
RPM_HASH = "3286b13ec4ea029206cc6c84d099bdcd4d81540eee9346d1ddcdf0bb8fa68059dcb1dc9f8a84a2c1d0f80c261c79d33801ac812694fdae379a4aff943aa67d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachelib python3.10dist(cachelib) python310-cachelib python3dist(cachelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
