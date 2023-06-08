SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-operator-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "45d7112592671703c39ab138cc5be63fc0e4b6821638b56a1503c03f258ed361847061705858d1159d32b9dcff527ae348652567fa07f14e1612030d664f8f82"

RPROVIDES:${PN} += "kubevirt-virt-operator kubevirt-virt-operator(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
