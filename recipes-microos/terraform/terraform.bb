SUMMARY = "Tool for building infrastructure safely and efficiently"
DESCRIPTION = "Terraform is a tool for building, changing, and versioning infrastructure \
safely and efficiently. Terraform can manage existing and popular service \
providers as well as custom in-house solutions."
LICENSE = "MPL-2.0"

PV = "1.4.6"

RPM_NAME = "terraform-1.4.6-1.1.aarch64.rpm"
RPM_HASH = "ef539bfd4ebc49554366d472b4d241978e76f2762a9f921b86e6c2d9a191b9349bb8c5ad292e8cc772dc763b18f8e1e0e5843dd0389bfa900de4b588781fdaa4"

RPROVIDES:${PN} += "terraform terraform(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
