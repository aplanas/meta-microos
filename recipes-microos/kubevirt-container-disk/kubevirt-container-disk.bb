SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-container-disk-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "65b528bcf73ff372500acc391522406e31a2a2ace824bbbf6dca269af38c3ca29bda1a106c901cc99eb75c3c0dd1ee05e02a970a76f4c49ac2aa4110d2c8b323"

RPROVIDES:${PN} += "kubevirt-container-disk kubevirt-container-disk(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
