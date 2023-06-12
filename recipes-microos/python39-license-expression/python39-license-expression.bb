SUMMARY = "Library to parse, compare, simplify and normalize license expressions"
DESCRIPTION = "This module defines a mini language to parse, validate, simplify, normalize and \
compare license expressions using a boolean logic engine. \
 \
This supports SPDX license expressions and also accepts other license naming \
conventions and license identifiers aliases to resolve and normalize licenses. \
 \
Using boolean logic, license expressions can be tested for equality, \
containment, equivalence and can be normalized or simplified."
LICENSE = "Apache-2.0"

PV = "30.1.0"

RPM_NAME = "python39-license-expression-30.1.0-1.2.noarch.rpm"
RPM_HASH = "7311799f2f00c5a7795f50aa6f64094357a12101fc7beca28a80a770709db4d47c84e66a0a11e5f7814c7fd8241c7e2b606cc18cbf7accad3fc30b484943cc34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(license-expression) \
python39-license-expression \
python3dist(license-expression)"
RDEPENDS:${PN} += "python(abi) \
python39-boolean.py"

inherit rpm
