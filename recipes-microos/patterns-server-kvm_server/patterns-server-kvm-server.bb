SUMMARY = "KVM Host Server"
DESCRIPTION = "Software to set up a server for configuring, managing, and monitoring virtual machines on a single physical machine."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-kvm_server-20210330-4.1.aarch64.rpm"
RPM_HASH = "346b925306763c0ce99eadcc5d6a4c9f0c6a7691c4bb8e3e2514569067d8e4d1dcce7c056ff1f847ded0b9fcbeb91565f9fc2daadefb94d07c24a3d1dda4b445"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-kvm_server patterns-server-kvm_server patterns-server-kvm_server(aarch-64)"
RDEPENDS:${PN} += "pattern() qemu-arm qemu-ipxe tftp"

inherit rpm
