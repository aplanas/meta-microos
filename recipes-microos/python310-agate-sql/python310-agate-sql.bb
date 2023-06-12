SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python310-agate-sql-0.5.9-2.1.noarch.rpm"
RPM_HASH = "3f416923f69386439e4b5b4094af2b6bcf1612f8b97ebca6d5a3d3a8f309438e944602912d1711a35dbd94c4bc7d84ca0a677d8c609f19b623e7dbce98a894ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-sql python3.10dist(agate-sql) python310-agate-sql python3dist(agate-sql)"
RDEPENDS:${PN} += "(python310-sqlalchemy >= 1.0.8 with python310-sqlalchemy < 2) python(abi) python310-agate"

inherit rpm
