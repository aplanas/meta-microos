SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-opentelemetry-api-1.5.0-3.1.noarch.rpm"
RPM_HASH = "7b4c1afacb9b879a7298e7d33f122e3df754aa36bba974d053c22979498653a2bf95cd27325da3546e402ab7e17458473949a507e065b9979bf255cf68125ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-api python3.10dist(opentelemetry-api) python310-opentelemetry-api python3dist(opentelemetry-api)"
RDEPENDS:${PN} += "python(abi) python310-setuptools"

inherit rpm
