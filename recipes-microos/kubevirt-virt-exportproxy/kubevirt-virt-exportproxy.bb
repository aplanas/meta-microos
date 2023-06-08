SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-exportproxy-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "442a1362370c51e4fc9a9899e38235646652e8461f2cea4efa94341ca04e244af5f18872c1b72bfd68988ef6332f89aafecf2fb94dff24c9d42d7123aec5416c"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy kubevirt-virt-exportproxy(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
