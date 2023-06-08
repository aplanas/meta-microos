SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "python310-sqlparse-0.4.3-1.4.noarch.rpm"
RPM_HASH = "ef0caa60d4e804748dadb2a4e1084ed97558757a5f692255e9ebd95395f33fc7cfd93fcdaa64735a20cafbd4b3e69d4e1181f9816babfef4d7741b8cb60dab40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlparse python3.10dist(sqlparse) python310-sqlparse python3dist(sqlparse)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
