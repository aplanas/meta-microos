SUMMARY = "Cirq package for Google Quantum Computing Service1"
DESCRIPTION = "A Cirq module that provides tools and access to the Google Quantum Computing Service"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-cirq-google-0.13.1-1.5.noarch.rpm"
RPM_HASH = "565fe2cfd34e9d17c6cc693adc74f95a83d318931fc0272015b240fea30c62558e0f00e0c0f7cb5bace01758fba6aaf55a27aa00619515cbdf6edd95c7ebd197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cirq-google) python39-cirq-google python3dist(cirq-google)"
RDEPENDS:${PN} += "python(abi) python39-cirq-core python39-google-api-core python39-grpcio python39-protobuf"

inherit rpm
