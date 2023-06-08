SUMMARY = "Cirq quantum algorithms on AQT quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to Alpine Quantum Technologies quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-cirq-aqt-0.13.1-1.5.noarch.rpm"
RPM_HASH = "b3d25227265e511497e1627979d2ae2e7927e4e5f691b717ed38a7c4845a244eb14a368e1f95f58755fecc3a11fdefda7feee428e6b373523af7494bd18e1702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cirq-aqt python3.10dist(cirq-aqt) python310-cirq-aqt python3dist(cirq-aqt)"
RDEPENDS:${PN} += "python(abi) python310-cirq-core python310-requests"

inherit rpm
