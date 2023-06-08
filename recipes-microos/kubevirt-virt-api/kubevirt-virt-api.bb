SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-api-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "86321b2ee22284e5ce982db8758c55cd12793e69eade5d5ee4206f92a7a2dd71408935f17ae81f3533d1f59129ce282d0085d39e50dd3c8a32454680739b62a3"

RPROVIDES:${PN} += "kubevirt-virt-api kubevirt-virt-api(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
