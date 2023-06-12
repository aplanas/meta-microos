SUMMARY = "OpenCensus threading Integration"
DESCRIPTION = "OpenCensus threading Integration"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python310-opencensus-ext-threading-0.1.2-2.9.noarch.rpm"
RPM_HASH = "58851aa200a62f04fbe6f9874b58aa186a947557c3e123e707cb5a03dc14de87e9f9647ac0199c77a20c8f2ad311b283c8cd94b7e54bd9e2f8f223ba052d6506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-ext-threading \
python3.10dist(opencensus-ext-threading) \
python310-opencensus-ext-threading \
python3dist(opencensus-ext-threading)"
RDEPENDS:${PN} += "python(abi) \
python310-opencensus"

inherit rpm
