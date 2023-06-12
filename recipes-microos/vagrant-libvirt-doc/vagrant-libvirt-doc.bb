SUMMARY = "Documentation for vagrant-libvirt"
DESCRIPTION = "This package contains the documentation for the Libvirt provider to Vagrant."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "vagrant-libvirt-doc-0.11.2-2.2.aarch64.rpm"
RPM_HASH = "1af7a9288713e31e33c4dc841c3a87512b742ab7844e567be3302c03b6d1e25dd6aac181838fd4cd7aa22f38c249fe223d4d3da8f6c67c2d3511ae2017a98dd2"

RPROVIDES:${PN} += "vagrant-libvirt-doc \
vagrant-libvirt-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
