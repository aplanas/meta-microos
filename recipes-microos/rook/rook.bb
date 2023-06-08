SUMMARY = "Orchestrator for distributed storage systems in cloud-native environments"
DESCRIPTION = "Rook is a cloud-native storage orchestrator for Kubernetes, providing \
the platform, framework, and support for a diverse set of storage \
solutions to integrate with cloud-native environments. \
 \
See https://github.com/rook/rook for more information."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-1.6.2+git0.ge8fd65f08-2.7.aarch64.rpm"
RPM_HASH = "cf36d885d54e7ddf84ebad7ea7102b762b2de498a5b6811c4009c2a2b6fff270e32fab01430e3b072eec65c534e686ff0e5067f53daf224f395baff61cbe25fe"

RPROVIDES:${PN} += "config(rook) rook rook(aarch-64)"
RDEPENDS:${PN} += "/bin/sh pattern() tini"

inherit rpm
