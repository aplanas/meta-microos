SUMMARY = "An implementation of contracts for Python"
DESCRIPTION = "This module provides a collection of decorators for \
writing software using contracts. \
 \
Contracts are a debugging and verification tool.  They are declarative \
statements about what states a program must be in to be considered \
'correct' at runtime.  They are similar to assertions, and are verified \
automatically at various well-defined points in the program.  Contracts can \
be specified on functions and on classes."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "python310-dpcontracts-0.6.0-3.1.noarch.rpm"
RPM_HASH = "d9b7b6220ac6fe175739b78f268056f6ce2258bebea1e99ee8362c174de97c1dc4657f492cab08c3f0a4d048a03c44f48962cd8430b91dc58940b140589dac01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dpcontracts \
python3.10dist(dpcontracts) \
python310-dpcontracts \
python3dist(dpcontracts)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
