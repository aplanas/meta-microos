SUMMARY = "Friendly state machines for python"
DESCRIPTION = "Friendly state machines for python. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-automaton-3.1.0-1.2.noarch.rpm"
RPM_HASH = "72d99079fddf4737e14976f2d4dc659c5ba48c001ca68195d61bf35c7aa1d242183c647fc77a7b2594473d63c0119e5e019666f842815b9326472d9d828a943d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-automaton python3.10dist(automaton) python3dist(automaton)"
RDEPENDS:${PN} += "python(abi) python3-PrettyTable python3-pbr python3-six"

inherit rpm
