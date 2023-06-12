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

RPM_NAME = "python39-dpcontracts-0.6.0-3.1.noarch.rpm"
RPM_HASH = "4ed818751e7d52fc66da4071b852f48f6bb14c0d9f87db3ff0b9e6514646bc6660475b9e0b6bd1436709df305c14b6c1170f2e833cb735992b5d1e256114c655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dpcontracts) \
python39-dpcontracts \
python3dist(dpcontracts)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
