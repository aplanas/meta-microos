SUMMARY = "A lil' TOML writer"
DESCRIPTION = "Tomli-W is a Python library for writing TOML. It is a write-only counterpart to Tomli, \
which is a read-only TOML parser."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-tomli-w-1.0.0-3.1.noarch.rpm"
RPM_HASH = "9b22ed184fb16bd1556c1364249e37f6b9a476b679c604860497dcf987afb9ba81e8b783dcb28534ea3bf6e1f57eddf665d2259cd56d64ec54e8534866323bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tomli-w) python311-tomli-w python3dist(tomli-w)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
