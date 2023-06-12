SUMMARY = "Module to define boolean algebras and create/parse boolean expressions"
DESCRIPTION = "'boolean.py' is a library implementing a boolean algebra. It defines \
two base elements, TRUE and FALSE, and a Symbol class that can take on one of \
these two values. Calculations are done in terms of AND, OR and NOT - other \
compositions like XOR and NAND are not implemented but can be emulated with \
AND or and NOT. Expressions are constructed from parsed strings or in Python."
LICENSE = "BSD-2-Clause"

PV = "4.0"

RPM_NAME = "python310-boolean.py-4.0-1.3.noarch.rpm"
RPM_HASH = "392b3cfaf8f391c16d5bc0ecb4fea6df0208224875edc89a74f596a78aae83e9bfd7ad14345e9fa06ec24f4510b3812931f8b8f26afd7a0592a14746a446d44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boolean.py \
python3.10dist(boolean.py) \
python310-boolean.py \
python3dist(boolean.py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
