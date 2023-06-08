SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.8.2"

RPM_NAME = "python311-time-machine-2.8.2-2.1.aarch64.rpm"
RPM_HASH = "b0e6bdc51addd8244d50c7186808994e9ddd8e075b5b44abeaed5234d14cb6cd0a450c26b84f57033396531f448ba65b33b857af7b8e0768d75305eb28c60c10"

RPROVIDES:${PN} += "python3.11dist(time-machine) python311-time-machine python311-time-machine(aarch-64) python3dist(time-machine)"
RDEPENDS:${PN} += "python(abi) python3.11dist(python-dateutil)"

inherit rpm
