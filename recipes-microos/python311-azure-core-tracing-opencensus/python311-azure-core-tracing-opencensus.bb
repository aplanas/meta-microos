SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b8"

RPM_NAME = "python311-azure-core-tracing-opencensus-1.0.0b8-1.8.noarch.rpm"
RPM_HASH = "26f07f81c164fb65293b5db403f4dee28faee89b5c158cae07e64a8563dfa36bb0ce6b9ac82ec9138c6c615a48cf5783402fbac1f9f5734a71c40a68d9e0d85c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-core-tracing-opencensus) python311-azure-core-tracing-opencensus python3dist(azure-core-tracing-opencensus)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-opencensus python311-opencensus-ext-azure python311-opencensus-ext-threading"

inherit rpm
