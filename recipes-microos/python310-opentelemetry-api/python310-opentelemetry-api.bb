SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.17.0"

RPM_NAME = "python310-opentelemetry-api-1.17.0-1.1.noarch.rpm"
RPM_HASH = "f76f6c74e29abe46aeb16731994c92af3b1502ad5d3cc00590233bd2b62541f7ac7d387e6232568c1105c6f8bbf0df455645d64d3d48b366d1060d6f0104549c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-api python3.10dist(opentelemetry-api) python310-opentelemetry-api python3dist(opentelemetry-api)"
RDEPENDS:${PN} += "python(abi) python310-Deprecated python310-importlib-metadata python310-setuptools"

inherit rpm
