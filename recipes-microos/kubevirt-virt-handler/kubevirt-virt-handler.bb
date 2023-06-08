SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-handler-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "a94a5975be47d593272b33081fc29833430c4f81bf290bbe1f7edc9022b0f2090bf15bef548b72d13f0530bf5c935de87199f6e59f32fe6fb621e3ceb635fb02"

RPROVIDES:${PN} += "kubevirt-virt-handler kubevirt-virt-handler(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
