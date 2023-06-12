SUMMARY = "KVM Virtualization Host and tools"
DESCRIPTION = "This will provide all minimal system to get a running KVM Hypervisor \
and be able to configure, manage, and monitor virtual machines on a \
single physical machine."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-kvm_tools-20210330-5.1.aarch64.rpm"
RPM_HASH = "5aaabc9ab84f95d79910b6b9fcd8150680a8bcc67d987df3e86d1f9ca6ae9a2a3a58b53957c182992944a66b575e3de446d530421475e31b3e2160f2fa8b9eeb"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-server-kvm_tools patterns-server-kvm_tools(aarch-64)"
RDEPENDS:${PN} += "libvirt-client libvirt-daemon-config-network libvirt-daemon-qemu pattern() tigervnc virt-install virt-manager"

inherit rpm
