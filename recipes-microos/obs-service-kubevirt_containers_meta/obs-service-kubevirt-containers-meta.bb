SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "obs-service-kubevirt_containers_meta-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "0a9d2c6408ba02e9c81e3d632f49748253deb2ea1b9ba3c93ae525d22566e43bdc7d3940e9f652c3f530fd12455676b9952190a12b3aaeae34f667cc905448d0"

RPROVIDES:${PN} += "obs-service-kubevirt_containers_meta obs-service-kubevirt_containers_meta(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
