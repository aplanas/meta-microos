SUMMARY = "CDI containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the CDI container images."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "obs-service-cdi_containers_meta-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "6d3a77a7e8b9706813ce976c0f4573c403f64e1197b4de745e7fa02abfb9c54e07a2ba3a42a71a6e7f3ce8f1265c11e5c6a90b1c2fd36bbc93c9760fca63d42c"

RPROVIDES:${PN} += "obs-service-cdi_containers_meta obs-service-cdi_containers_meta(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
