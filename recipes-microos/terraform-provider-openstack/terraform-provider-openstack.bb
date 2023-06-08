SUMMARY = "Terraform OpenStack provider"
DESCRIPTION = "This is a terraform provider that lets you provision servers on an OpenStack platform via Terraform."
LICENSE = "MPL-2.0"

PV = "1.43.0"

RPM_NAME = "terraform-provider-openstack-1.43.0-2.8.aarch64.rpm"
RPM_HASH = "072e0fbd3664791a9f2c41cc033752a1a7502210bf683e9fd334fe3d59358ea5a69a7c86f6183673a61b2e4063cb0ff348f409fefd69a8d66cbbd2f13706006a"

RPROVIDES:${PN} += "terraform-provider-openstack terraform-provider-openstack(aarch-64)"
RDEPENDS:${PN} += "mkisofs terraform"

inherit rpm
