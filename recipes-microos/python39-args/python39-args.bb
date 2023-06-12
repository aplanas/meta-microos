SUMMARY = "Python command argument interface"
DESCRIPTION = "This module gives developers an interface for command line argumemnts."
LICENSE = "BSD-2-Clause"

PV = "0.1.0"

RPM_NAME = "python39-args-0.1.0-2.15.noarch.rpm"
RPM_HASH = "d5a5698f185d55bd2a6fa0dd5bf69a3294d4c8824e75679a3aab46ae75a8084850a4bf688378598ae0ca6caa0e4c361517175e5bf8a1f3c8b00931bb9bdd2125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(args) \
python39-args \
python3dist(args)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
