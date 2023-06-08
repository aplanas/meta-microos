SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python310-agate-sql-0.5.9-1.4.noarch.rpm"
RPM_HASH = "245e65e87f7de54c10ce8a63c5176dbf2d617295685815dea491691fddfa060c6194443a840590cac181e8ec555e218aef8c591fe088aedd4bfdc9c2f9327f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-sql python3.10dist(agate-sql) python310-agate-sql python3dist(agate-sql)"
RDEPENDS:${PN} += "(python310-SQLAlchemy >= 1.0.8 with python310-SQLAlchemy < 2) python(abi) python310-agate"

inherit rpm
