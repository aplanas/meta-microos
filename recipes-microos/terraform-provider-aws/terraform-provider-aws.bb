SUMMARY = "Terraform provider for Amazon Web Services (AWS)"
DESCRIPTION = "This is a terraform provider that lets you provision servers on Amazon Web \
Services via Terraform."
LICENSE = "MPL-2.0"

PV = "3.51.0"

RPM_NAME = "terraform-provider-aws-3.51.0-2.8.aarch64.rpm"
RPM_HASH = "de4a4f77ab7986507f7a429d9e5206847058ef07edaa8ae56d552c3f4d5446c1c77a04c20351230cea18a46d5cba126d1302c1a1d06bb8e04e068645525118ed"

RPROVIDES:${PN} += "terraform-provider-aws terraform-provider-aws(aarch-64)"
RDEPENDS:${PN} += "terraform"

inherit rpm
