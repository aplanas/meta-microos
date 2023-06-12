SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-handler-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "25725481f670dfa2d6157e4c2e8c889fe2cdd24174497f443f095235e2959837afbac6e6603575d563b52e9145d45120dfbd334ce7516747d0522cac56f24a9d"

RPROVIDES:${PN} += "kubevirt-virt-handler kubevirt-virt-handler(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
