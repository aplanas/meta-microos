SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "python311-parameterized-0.8.1-4.1.noarch.rpm"
RPM_HASH = "b3ea61f57cd58d67ca774973094b5d655a128ac9b3b63c58b2830917b28c278fceb218877c3acdbb41310050206c73a23bd1a5fdbbbaba4a066fb6db1cffc323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(parameterized) python311-parameterized python3dist(parameterized)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
