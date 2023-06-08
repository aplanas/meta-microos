SUMMARY = "Rook Ceph operator helm charts"
DESCRIPTION = "Helm helps manage Kubernetes applications. Helm Charts define, \
install, and upgrade Kubernetes applications. Rook is a \
cloud-native storage orchestrator for Kubernetes, providing \
the platform, framework, and support for a diverse set of storage \
solutions to integrate with cloud-native environments. \
 \
This package contains Helm Charts for Rook."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-ceph-helm-charts-1.6.2+git0.ge8fd65f08-2.7.noarch.rpm"
RPM_HASH = "2aa4d90f0b2d4a856d86e62ece54a7142c68374ad76c50ad8ae2e79b098a6f9f7833834a564919ecad541155a87b7f96f7ee3d9e0ac583bee478d862e693c527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rook-ceph-helm-charts"
RDEPENDS:${PN} += ""

inherit rpm
