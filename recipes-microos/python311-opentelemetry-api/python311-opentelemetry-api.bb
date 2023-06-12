SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.17.0"

RPM_NAME = "python311-opentelemetry-api-1.17.0-1.1.noarch.rpm"
RPM_HASH = "356eadedb09cc17e6fb47f98c78779ab286bae9ff8e91944a791faebf4a07ce965341f05908848cb44d61f45fcc55d3b8f487793bfcde137d8f2cfe80bf05ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(opentelemetry-api) python311-opentelemetry-api python3dist(opentelemetry-api)"
RDEPENDS:${PN} += "python(abi) python311-Deprecated python311-importlib-metadata python311-setuptools"

inherit rpm
