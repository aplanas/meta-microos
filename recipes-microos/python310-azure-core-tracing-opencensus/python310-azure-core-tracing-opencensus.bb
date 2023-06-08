SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b8"

RPM_NAME = "python310-azure-core-tracing-opencensus-1.0.0b8-1.8.noarch.rpm"
RPM_HASH = "672261ba53c4df41e606c7bdb30f70ebc636ad5938fdcdccf57e1d07c8cebf72525c6edaef8370796e7bd69370f0667dc638dffa76e34e8e665d8a4bf080ba82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core-tracing-opencensus python3.10dist(azure-core-tracing-opencensus) python310-azure-core-tracing-opencensus python3dist(azure-core-tracing-opencensus)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg python310-opencensus python310-opencensus-ext-azure python310-opencensus-ext-threading"

inherit rpm
