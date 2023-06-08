SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "python311-sqlparse-0.4.3-1.4.noarch.rpm"
RPM_HASH = "21408f3d805ab2028a4f14edf6201468dc7822b2a78059e12d1895cbfff1a34870e3626cd3e18e10887cae45ed2b5850e8d44be36346a249feb6d3ad5a560bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sqlparse) python311-sqlparse python3dist(sqlparse)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
