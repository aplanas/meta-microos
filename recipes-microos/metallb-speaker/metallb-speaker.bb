SUMMARY = "MetalLB speaker binary"
DESCRIPTION = "MetalLB is a load-balancer implementation for bare metal Kubernetes clusters, using standard routing protocols. \
This package contains the speaker binary."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-speaker-0.9.5-1.12.aarch64.rpm"
RPM_HASH = "dbdc378d01b95e36ca8e0abd91450d8691e0fab33fc79d6382fe5df2164ca98b519362586ecae3d66de0b7f320f09c72aefb313afd68e154b2f16df4a60a5f95"

RPROVIDES:${PN} += "metallb-speaker metallb-speaker(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
