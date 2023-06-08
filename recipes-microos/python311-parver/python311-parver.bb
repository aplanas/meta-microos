SUMMARY = "Module to parse and manipulate version numbers"
DESCRIPTION = "parver allows parsing and manipulation of `PEP 440`_ version numbers."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-parver-0.4-1.2.noarch.rpm"
RPM_HASH = "7b9b1df9996995f62d1817ea539e77b79350aa08cd4ceae073c5e2d4cc48633b055d938707d07f08d3e3a3e1abacb1dad2655c4b130e8aa2b92cd9866c64b37e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(parver) python311-parver python3dist(parver)"
RDEPENDS:${PN} += "python(abi) python311-Arpeggio python311-attrs python311-typing_extensions"

inherit rpm
