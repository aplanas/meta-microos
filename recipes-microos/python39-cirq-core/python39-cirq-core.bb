SUMMARY = "Cirq quantum algorithms for NISQ devices"
DESCRIPTION = "Cirq is a Python library for writing, manipulating, and optimizing quantum \
circuits and running them against quantum computers and simulators. \
 \
This module contains everything you'd need to write quantum algorithms for NISQ devices and run them on the built-in Cirq simulators. \
In order to run algorithms on a given quantum hardware platform, you'll have to install the right cirq module as well."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-cirq-core-0.13.1-1.5.noarch.rpm"
RPM_HASH = "5420fd1a74d03536434a8cb55d2e2ffd3a790e24cb5acfde682c656d12f59072364cd94212b7927c52150916d278fbd09aabba0355a5b7362d495dd6397a1155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cirq-core) python39-cirq-core python3dist(cirq-core)"
RDEPENDS:${PN} += "python(abi) python39-duet python39-matplotlib python39-networkx python39-numpy python39-pandas python39-scipy python39-sortedcontainers python39-sympy python39-tqdm python39-typing_extensions"

inherit rpm
