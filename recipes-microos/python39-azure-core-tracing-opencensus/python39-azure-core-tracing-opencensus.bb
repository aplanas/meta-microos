SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b8"

RPM_NAME = "python39-azure-core-tracing-opencensus-1.0.0b8-1.8.noarch.rpm"
RPM_HASH = "be68df153365a8789fd4e1ed369505782553418c7026664f704b80f3571a207eb52ea05859c4381e8331cbd94918107328cf00a8adc0d105519476fb7fb47488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-core-tracing-opencensus) python39-azure-core-tracing-opencensus python3dist(azure-core-tracing-opencensus)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-opencensus python39-opencensus-ext-azure python39-opencensus-ext-threading"

inherit rpm
