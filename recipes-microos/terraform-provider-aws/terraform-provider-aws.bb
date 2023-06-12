SUMMARY = "Terraform provider for Amazon Web Services (AWS)"
DESCRIPTION = "This is a terraform provider that lets you provision servers on Amazon Web \
Services via Terraform."
LICENSE = "MPL-2.0"

PV = "3.51.0"

RPM_NAME = "terraform-provider-aws-3.51.0-2.9.aarch64.rpm"
RPM_HASH = "397ac1e8068b2b3fb621ba7ef15a370cd8d524320e74e5f4819c78add6a73a834668f55ae37ab27179391b31f8b8afd54b373e68bf422976ca286d3d4ab37b5d"

RPROVIDES:${PN} += "terraform-provider-aws terraform-provider-aws(aarch-64)"
RDEPENDS:${PN} += "terraform"

inherit rpm
