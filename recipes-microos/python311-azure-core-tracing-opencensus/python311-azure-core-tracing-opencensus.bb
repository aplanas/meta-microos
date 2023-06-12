SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python311-azure-core-tracing-opencensus-1.0.0b9-1.1.noarch.rpm"
RPM_HASH = "12e09ec5ef255a81a37c1088fdc6a165bb7fcc838ae3447abab54016c2d53216a2b487e42d7a59ef7e589704e44d7984ac742412759fe4cb623d9067fa57b8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-core-tracing-opencensus) python311-azure-core-tracing-opencensus python3dist(azure-core-tracing-opencensus)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-opencensus python311-opencensus-ext-azure python311-opencensus-ext-threading"

inherit rpm
