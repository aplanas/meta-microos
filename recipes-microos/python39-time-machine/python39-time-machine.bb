SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "python39-time-machine-2.9.0-2.1.aarch64.rpm"
RPM_HASH = "d16f6d04c69070fb78b9a55118330d7b96fbf3ae2970bd9306cbe7d6f9afbd8b9c401c09dc95a4e27ee52558b0d1fc0f86fb772cbe1c1ec1ca6636b4f8947a3e"

RPROVIDES:${PN} += "python3.9dist(time-machine) python39-time-machine python39-time-machine(aarch-64) python3dist(time-machine)"
RDEPENDS:${PN} += "python(abi) python39-python-dateutil timezone"

inherit rpm
