SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.5.9"

RPM_NAME = "python39-agate-sql-0.5.9-2.1.noarch.rpm"
RPM_HASH = "c76821ac64f6ddb63c21a57f3aaf94fb4823c5c41074f70c64fa3337e7bc89c1298219eaafc83d260e3542ec11228be0d8e1e56c2b97808ef3203488c137904f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(agate-sql) python39-agate-sql python3dist(agate-sql)"
RDEPENDS:${PN} += "(python39-sqlalchemy >= 1.0.8 with python39-sqlalchemy < 2) python(abi) python39-agate"

inherit rpm
