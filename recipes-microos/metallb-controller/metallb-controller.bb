SUMMARY = "MetalLB controller binary"
DESCRIPTION = "MetalLB is a load-balancer implementation for bare metal Kubernetes clusters, using standard routing protocols. \
This package contains the controller binary."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-controller-0.9.5-1.12.aarch64.rpm"
RPM_HASH = "e2bd97292dbd2d3736fd4e5b8eed23fa00ec301e60389a43dfcd6cbeb332e3c94a4dd8d23859d100513238932b8be0e0d52f6118f0afea51cde702df4271edb0"

RPROVIDES:${PN} += "metallb-controller metallb-controller(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
