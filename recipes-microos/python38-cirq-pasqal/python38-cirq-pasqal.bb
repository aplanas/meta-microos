SUMMARY = "Cirq quantum algorithms on Pasqal quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to Pasqal quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python38-cirq-pasqal-0.13.1-1.5.noarch.rpm"
RPM_HASH = "195e0aa0647e61221aba9e5806841f1a6e542292f5730d6eec89009675d39f1eb1b30ce9a6ce0fa78417814e747dff41ff85d7e0315c94ae226b13fa04c6cdfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(cirq-pasqal) python38-cirq-pasqal python3dist(cirq-pasqal)"
RDEPENDS:${PN} += "python(abi) python38-cirq-core python38-requests"

inherit rpm
