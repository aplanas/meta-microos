SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-exportserver-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "61d68ddc3a23f30f6bd50b1db299505fb22ade69823679a32c6be34173e13a03cb4bbca49677667c751149aa24283b509a6bef95ce43e480973036c0dc748442"

RPROVIDES:${PN} += "kubevirt-virt-exportserver kubevirt-virt-exportserver(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
