SUMMARY = "OpenCensus Azure Monitor Exporters"
DESCRIPTION = "OpenCensus Azure Monitor Exporters"
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "python39-opencensus-ext-azure-1.1.6-1.3.noarch.rpm"
RPM_HASH = "cfda5a11a583ba05ca6e72692a672ecabd63e65d7838ee830697eec58e54d316cc32833a950a54458f0c8d0761ea2f4c5f6e129393d2effd70264c13f62468c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(opencensus-ext-azure) python39-opencensus-ext-azure python3dist(opencensus-ext-azure)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-identity python39-opencensus python39-psutil python39-requests"

inherit rpm
