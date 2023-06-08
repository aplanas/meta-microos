SUMMARY = "Thin wrapper for Terraform for working with multiple Terraform modules"
DESCRIPTION = "Terragrunt is a thin wrapper for Terraform that provides extra tools for keeping your Terraform configurations DRY, working with multiple Terraform modules, and managing remote state."
LICENSE = "MIT"

PV = "0.45.10"

RPM_NAME = "terragrunt-0.45.10-1.1.aarch64.rpm"
RPM_HASH = "9561376f280b08576f7327492d156e911d176f6555a9cc9b302df853c235ae95995f5d7c6b562bc9c76948a67eae26a24ec16b14e75ae6a918676e16c89dfa36"

RPROVIDES:${PN} += "terragrunt terragrunt(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
