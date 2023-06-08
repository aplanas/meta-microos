SUMMARY = "KVM Virtualization Host and tools"
DESCRIPTION = "This will provide all minimal system to get a running KVM Hypervisor \
and be able to configure, manage, and monitor virtual machines on a \
single physical machine."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-kvm_tools-20210330-4.1.aarch64.rpm"
RPM_HASH = "dd16cfc3b162c2329bb571b94222968bbd2e152360b66f6adc9d50a760ffb3a009eabfec7141868122d9b124058c4b75a443c5d44a0f5ade313138840519eb2a"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-server-kvm_tools patterns-server-kvm_tools(aarch-64)"
RDEPENDS:${PN} += "libvirt-client libvirt-daemon-config-network libvirt-daemon-qemu pattern() tigervnc virt-manager vm-install"

inherit rpm
