SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "python39-parameterized-0.8.1-4.1.noarch.rpm"
RPM_HASH = "09f419b3155da29175f6c251bea317a294331d169537c43d4ccc010644a94bfd8193e2ff6ddf358cc7948763a5c3b6244d894061df5775d517ad9163ec08173e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parameterized) python39-parameterized python3dist(parameterized)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
