SUMMARY = "Cirq quantum algorithms on IonQ quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to IonQ quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-cirq-ionq-0.13.1-1.5.noarch.rpm"
RPM_HASH = "f336cc26d07cafde93fb706549ea49eb4b2c20b21df8492f4e00c3bb90456a57bfc28e292f419bca6ab4ff36ecec193d600c7833d3b4c4f330f65aed0b8665aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cirq-ionq \
python3.10dist(cirq-ionq) \
python310-cirq-ionq \
python3dist(cirq-ionq)"
RDEPENDS:${PN} += "python(abi) \
python310-cirq-core \
python310-requests"

inherit rpm
