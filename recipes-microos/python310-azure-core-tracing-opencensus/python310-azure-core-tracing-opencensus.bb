SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b9"

RPM_NAME = "python310-azure-core-tracing-opencensus-1.0.0b9-1.1.noarch.rpm"
RPM_HASH = "5c055e3623841b61a5bf5e7b0d04e8bf2e649a69be3218e22d672c232144baa053fc1acb2aeb881020d891a18307297ef332e29ab6a7c2916a62752ec681a514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core-tracing-opencensus python3.10dist(azure-core-tracing-opencensus) python310-azure-core-tracing-opencensus python3dist(azure-core-tracing-opencensus)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg python310-opencensus python310-opencensus-ext-azure python310-opencensus-ext-threading"

inherit rpm
