SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-controller-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "2be63c65b4bfbc6e766bf1bb93c1fa31bcbfd6caa6c0a8d003beec9fc65a5c7b97f372d0db10a1e1119d8bb612584613a51de2d0514880d883765b39d2c8fd93"

RPROVIDES:${PN} += "kubevirt-virt-controller kubevirt-virt-controller(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
