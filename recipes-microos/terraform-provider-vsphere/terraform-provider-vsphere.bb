SUMMARY = "Terraform vSphere provider"
DESCRIPTION = "This is a terraform provider that lets you provision servers on a VMWare vSphere server."
LICENSE = "MPL-2.0"

PV = "2.0.2"

RPM_NAME = "terraform-provider-vsphere-2.0.2-2.7.aarch64.rpm"
RPM_HASH = "0df7f914e359f069c93865e681243a265755ab584425bd5b71994de46787ab66bad4ad577cbaf543c35b77e6f8fd2e44eb58b77d6094f34f70c0b1e6bc59125c"

RPROVIDES:${PN} += "terraform-provider-vsphere terraform-provider-vsphere(aarch-64)"
RDEPENDS:${PN} += "mkisofs terraform"

inherit rpm
