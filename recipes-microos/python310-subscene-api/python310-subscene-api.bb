SUMMARY = "Python wrapper for Subscene subtitle database"
DESCRIPTION = "Exposes the Subscene subtitle database API to Python."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python310-subscene-api-2.0.0-2.15.noarch.rpm"
RPM_HASH = "b059b3bb2c2966d18690965b1727e18efaa309aeb9aba255731cd47ccd8e61e2acddb6ef8562920c7e3951553961218cb80c7b505aa879ae923db47233b5002e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subscene-api python3.10dist(subscene-api) python310-subscene-api python3dist(subscene-api)"
RDEPENDS:${PN} += "python(abi) python310-beautifulsoup4"

inherit rpm
