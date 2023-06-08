SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-opentelemetry-api-1.5.0-3.1.noarch.rpm"
RPM_HASH = "32b2ae9c5b1dfb18c1f88a475baea073b53392f2091afb9587a04d3a8d602d1575f88bfb6914835020969f34f90fa69c84adc9db9ab0c02a617f78e0b33dd2ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(opentelemetry-api) python39-opentelemetry-api python3dist(opentelemetry-api)"
RDEPENDS:${PN} += "python(abi) python39-setuptools"

inherit rpm
