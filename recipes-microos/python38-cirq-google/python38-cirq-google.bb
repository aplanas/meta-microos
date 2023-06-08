SUMMARY = "Cirq package for Google Quantum Computing Service1"
DESCRIPTION = "A Cirq module that provides tools and access to the Google Quantum Computing Service"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python38-cirq-google-0.13.1-1.5.noarch.rpm"
RPM_HASH = "f188a8844c0c4e69c94e84b0970b92721f6b001255072022ce33e68af13f56a83bda0d32d28e9377a8bada395f130548593f74f89997a3f74950be19cb1ec35e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(cirq-google) python38-cirq-google python3dist(cirq-google)"
RDEPENDS:${PN} += "python(abi) python38-cirq-core python38-google-api-core python38-grpcio python38-protobuf"

inherit rpm
