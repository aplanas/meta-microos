SUMMARY = "Terraform provider for kvm hypervisors via libvirt"
DESCRIPTION = "This is a terraform provider that lets you provision servers on a libvirt host \
via Terraform."
LICENSE = "MPL-2.0"

PV = "0.7.1"

RPM_NAME = "terraform-provider-libvirt-0.7.1-1.3.aarch64.rpm"
RPM_HASH = "1cfb810c25f83df6ac07e656ccb1fb332598ce896ac6db3959362e3a456425a4cbdcc01f456b1fc4739c9b6a7f741f478c215371cc912670b6b78b73c4fb861d"

RPROVIDES:${PN} += "terraform-provider-libvirt \
terraform-provider-libvirt(aarch-64)"
RDEPENDS:${PN} += "libvirt-client \
mkisofs \
terraform"

inherit rpm
