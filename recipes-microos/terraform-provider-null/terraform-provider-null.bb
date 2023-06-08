SUMMARY = "Terraform null-provider"
DESCRIPTION = "This is a terraform provider that lets you use null files"
LICENSE = "MPL-2.0"

PV = "3.1.0"

RPM_NAME = "terraform-provider-null-3.1.0-2.8.aarch64.rpm"
RPM_HASH = "67aa5e0dffd11650fd02f58e46115c3b7d9ae9f8321f60d8cd93f0721d50bc85b4abc333e7b67e2bac1cbd3bb3e2007ed4b264ea541e19a7b80b9d34aa963844"

RPROVIDES:${PN} += "terraform-provider-null terraform-provider-null(aarch-64)"
RDEPENDS:${PN} += "terraform"

inherit rpm
