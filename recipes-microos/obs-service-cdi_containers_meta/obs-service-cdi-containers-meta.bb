SUMMARY = "CDI containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the CDI container images."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "obs-service-cdi_containers_meta-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "df8fffb0624321609292d1efa7860a6f5c158cb54d72adf10897873644dec09c6115af5293aa09dc6cfb2758a55be4bd53c06f8d37396b7cecfec5d1c8f3f445"

RPROVIDES:${PN} += "obs-service-cdi_containers_meta obs-service-cdi_containers_meta(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
