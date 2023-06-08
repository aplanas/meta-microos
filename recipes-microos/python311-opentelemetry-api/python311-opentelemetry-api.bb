SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-opentelemetry-api-1.5.0-3.1.noarch.rpm"
RPM_HASH = "ee6507a4fbcae6bcc8432098d74c8d41ffbeaed59b4f6f47a723d5a077f01b2445729e21aa08d0a825e2140bcbc495088dbb7d126ef54ca75bd3634cb34d654d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(opentelemetry-api) python311-opentelemetry-api python3dist(opentelemetry-api)"
RDEPENDS:${PN} += "python(abi) python311-setuptools"

inherit rpm
