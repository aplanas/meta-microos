SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.8.2"

RPM_NAME = "python39-time-machine-2.8.2-2.1.aarch64.rpm"
RPM_HASH = "b54c39ae0494c06b0b3ce6563f45c9664344778c87b206a6845a5c67f01081f6b33060e859c487eb50ac19b866b3731a79e95800efd0ad8e8000454cf3496224"

RPROVIDES:${PN} += "python3.9dist(time-machine) python39-time-machine python39-time-machine(aarch-64) python3dist(time-machine)"
RDEPENDS:${PN} += "python(abi) python3.9dist(python-dateutil)"

inherit rpm
