SUMMARY = "Orchestrator for distributed storage systems in cloud-native environments"
DESCRIPTION = "Rook is a cloud-native storage orchestrator for Kubernetes, providing \
the platform, framework, and support for a diverse set of storage \
solutions to integrate with cloud-native environments. \
 \
See https://github.com/rook/rook for more information."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-1.6.2+git0.ge8fd65f08-2.8.aarch64.rpm"
RPM_HASH = "35b2eff1dea3ee6ae23c325125eb1f3e53b39a88651153184b1f59218c7bb7900433aea7ad7e65659cea661be1856756832827ba4ae457d623dbf172b98d4b60"

RPROVIDES:${PN} += "config(rook) rook rook(aarch-64)"
RDEPENDS:${PN} += "/bin/sh pattern() tini"

inherit rpm
