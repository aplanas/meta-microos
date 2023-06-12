SUMMARY = "Module to define boolean algebras and create/parse boolean expressions"
DESCRIPTION = "'boolean.py' is a library implementing a boolean algebra. It defines \
two base elements, TRUE and FALSE, and a Symbol class that can take on one of \
these two values. Calculations are done in terms of AND, OR and NOT - other \
compositions like XOR and NAND are not implemented but can be emulated with \
AND or and NOT. Expressions are constructed from parsed strings or in Python."
LICENSE = "BSD-2-Clause"

PV = "4.0"

RPM_NAME = "python311-boolean.py-4.0-1.3.noarch.rpm"
RPM_HASH = "e07208ef520af3186e18fd73b29240ad5bb267639a2ba9f003afff5e00943b71eb9b4b124ffdfc1d3a726e9a645ff6b17b330b2097482ffd2a41dec3a66d5be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(boolean.py) \
python311-boolean.py \
python3dist(boolean.py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
