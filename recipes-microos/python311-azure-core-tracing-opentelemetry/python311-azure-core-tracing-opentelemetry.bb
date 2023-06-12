SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python311-azure-core-tracing-opentelemetry-1.0.0b9-1.8.noarch.rpm"
RPM_HASH = "e74fa9714ea80d219131adb6fce8957b98b633b7c20d501ff165ad31c07eb21ffeba1c307aa7a7233f229fa34fd3537a0c23149d7a95b96ecc0ad3a8504dd469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-core-tracing-opentelemetry) \
python311-azure-core-tracing-opentelemetry \
python3dist(azure-core-tracing-opentelemetry)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-core \
python311-azure-nspkg \
python311-opentelemetry-api"

inherit rpm
