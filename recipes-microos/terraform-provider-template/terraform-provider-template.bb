SUMMARY = "Terraform template-provider"
DESCRIPTION = "This is a terraform provider that lets you use template files"
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "terraform-provider-template-2.2.0-2.8.aarch64.rpm"
RPM_HASH = "8bba74ea38294339975c544c5c1156038f5d563e5c71c1043c08cd83d2284a85f818bb0d56d436aff806b999178802791b9b2deea42f330ed6195cae03d8e4b5"

RPROVIDES:${PN} += "terraform-provider-template terraform-provider-template(aarch-64)"
RDEPENDS:${PN} += "terraform"

inherit rpm
