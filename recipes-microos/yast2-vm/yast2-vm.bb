SUMMARY = "Configure Hypervisor and Tools for Xen and KVM"
DESCRIPTION = "This YaST module installs the tools necessary for creating VMs with Xen or KVM."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-vm-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "85c5cf10731fce59e0fccc63796f59b950894674422440be6c0e04d3d2823b19e739c5138c22aab9f693aea366deb9d90ba54108341cb1dde80bddabd664d4f1"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.RelocationServer.desktop) application(org.opensuse.yast.VirtualizationConfig.desktop) metainfo() metainfo(org.opensuse.yast.RelocationServer.metainfo.xml) metainfo(org.opensuse.yast.VirtualizationConfig.metainfo.xml) yast2-vm yast2-vm(aarch-64)"
RDEPENDS:${PN} += "yast2 yast2-bootloader yast2-network yast2-ruby-bindings"

inherit rpm
