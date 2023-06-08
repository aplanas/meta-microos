SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.8.2"

RPM_NAME = "python310-time-machine-2.8.2-2.1.aarch64.rpm"
RPM_HASH = "2f2b0f3693cd34b52f70794a08b7250aafba00bdd3911bae624000d1a8aadad282bf9a50097a2aa89e5ecc5a8c23d4c041d840ec247b055d5b24b9dac4545737"

RPROVIDES:${PN} += "python3-time-machine python3.10dist(time-machine) python310-time-machine python310-time-machine(aarch-64) python3dist(time-machine)"
RDEPENDS:${PN} += "python(abi) python3.10dist(python-dateutil)"

inherit rpm
