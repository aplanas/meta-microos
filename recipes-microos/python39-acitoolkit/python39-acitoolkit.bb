SUMMARY = "Python library for programming ACI"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python39-acitoolkit-0.4-5.5.noarch.rpm"
RPM_HASH = "c47767c8e57157066334b6ca52bd30e9172229117c052428429698af9e490a291a60923fbd529806693604bad7ce5c2bf06416cc5db37c8ffcfc1c714df0bd26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(acitoolkit) \
python39-acitoolkit \
python3dist(acitoolkit)"
RDEPENDS:${PN} += "python(abi) \
python39-graphviz \
python39-jsonschema \
python39-requests \
python39-tabulate \
python39-websocket-client"

inherit rpm
