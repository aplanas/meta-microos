SUMMARY = "Terraform provider for Azure Resource Manager (AzureRM)"
DESCRIPTION = "This is a terraform provider that lets you provision servers on Azure Resource \
Manager via Terraform."
LICENSE = "MPL-2.0"

PV = "3.35.0"

RPM_NAME = "terraform-provider-azurerm-3.35.0-1.4.aarch64.rpm"
RPM_HASH = "db88d3805185fe25b12cbe54b7dd7c3e334655d2e1089749e71b2f2c0f49ba9cebbe87b4cafac3c950e5075511b9e80cb0b5c6675dcd2e7e79c0bb26fdd74d87"

RPROVIDES:${PN} += "terraform-provider-azurerm terraform-provider-azurerm(aarch-64)"
RDEPENDS:${PN} += "terraform"

inherit rpm
