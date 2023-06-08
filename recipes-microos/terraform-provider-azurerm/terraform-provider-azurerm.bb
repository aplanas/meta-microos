SUMMARY = "Terraform provider for Azure Resource Manager (AzureRM)"
DESCRIPTION = "This is a terraform provider that lets you provision servers on Azure Resource \
Manager via Terraform."
LICENSE = "MPL-2.0"

PV = "3.35.0"

RPM_NAME = "terraform-provider-azurerm-3.35.0-1.3.aarch64.rpm"
RPM_HASH = "e45f374bcaec0593d4ae0d6cae93036b10e549ceefde9de43ffe7ea05ded4886e5a50ac4f898b35608d64fb3bf131b05c55f958e4df73158f2501b3ef8b6a481"

RPROVIDES:${PN} += "terraform-provider-azurerm terraform-provider-azurerm(aarch-64)"
RDEPENDS:${PN} += "terraform"

inherit rpm
