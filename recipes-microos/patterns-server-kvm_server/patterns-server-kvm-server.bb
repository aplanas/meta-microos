SUMMARY = "KVM Host Server"
DESCRIPTION = "Software to set up a server for configuring, managing, and monitoring virtual machines on a single physical machine."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-kvm_server-20210330-5.1.aarch64.rpm"
RPM_HASH = "9a9ea5c98cf1ccb3b692823ce2f61e8541e65a741dd97ca20f6888cf23e69b728db98599e69120c8dce118898f9c7c581d46fbabe77f61f16ee6b7d2325b6187"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-openSUSE-kvm_server \
patterns-server-kvm_server \
patterns-server-kvm_server(aarch-64)"
RDEPENDS:${PN} += "pattern() \
qemu-arm \
qemu-ipxe \
tftp"

inherit rpm
