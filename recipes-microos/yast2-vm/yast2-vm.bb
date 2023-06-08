SUMMARY = "Configure Hypervisor and Tools for Xen and KVM"
DESCRIPTION = "This YaST module installs the tools necessary for creating VMs with Xen or KVM."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-vm-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "186099dd330f176afb494b93cf0fcfbbb8739cecd3b9e3af4948bcc11c00ff63d05f49861bd0c0f81243cb81ad10b27c86015067565e153f816aaef97c690b06"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.RelocationServer.desktop) application(org.opensuse.yast.VirtualizationConfig.desktop) metainfo() metainfo(org.opensuse.yast.RelocationServer.metainfo.xml) metainfo(org.opensuse.yast.VirtualizationConfig.metainfo.xml) yast2-vm yast2-vm(aarch-64)"
RDEPENDS:${PN} += "yast2 yast2-bootloader yast2-network yast2-ruby-bindings"

inherit rpm
