SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python311-agate-sql-0.5.9-1.4.noarch.rpm"
RPM_HASH = "899f0d069d1b0fae147e3e998b1e7a7e2bb4a1c24bd24ea7f91f96f27330893bb9dc84c8cfb5fc6a4b7f034f7d9629524e58b94f44f5c0f3654e0b83c1c03b56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(agate-sql) python311-agate-sql python3dist(agate-sql)"
RDEPENDS:${PN} += "(python311-SQLAlchemy >= 1.0.8 with python311-SQLAlchemy < 2) python(abi) python311-agate"

inherit rpm
