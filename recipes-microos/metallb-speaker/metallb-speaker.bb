SUMMARY = "MetalLB speaker binary"
DESCRIPTION = "MetalLB is a load-balancer implementation for bare metal Kubernetes clusters, using standard routing protocols. \
This package contains the speaker binary."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-speaker-0.9.5-1.13.aarch64.rpm"
RPM_HASH = "4223d9ad26e51662ef3ebe3f0dda57ee1e28ea4e539feff5e10774a630872ea6ef132f0dc8dc90f1e0312edd0d54aad492387601aa37f3480875114d78acb08d"

RPROVIDES:${PN} += "metallb-speaker metallb-speaker(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
