SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-container-disk-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "5df6769fbe10129d46a90271473db8f023844fa91ad262ae945710c2e8496110c6d78c63cb051aedeaae1672bfee7ea54ae6564570e3f364ef719d0d87fcfb95"

RPROVIDES:${PN} += "kubevirt-container-disk kubevirt-container-disk(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
