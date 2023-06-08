SUMMARY = "Terraform Helm provider"
DESCRIPTION = "This is a Helm provider for Terraform. \
 \
The provider manages the installed Charts in your Kubernetes cluster, in the \
same way of Helm does, through Terraform. It will also install Tiller \
automatically if it is not already present."
LICENSE = "MPL-2.0"

PV = "2.9.0"

RPM_NAME = "terraform-provider-helm-2.9.0-1.3.aarch64.rpm"
RPM_HASH = "f133cc24d4eb7d4f04e82a77fa9e51277eb0085d6cb76441b69b33d012f55c327fd993a20981382a881a477a34c97175a7c9ffd0b225b741df221f44a92ccdb7"

RPROVIDES:${PN} += "terraform-provider-helm terraform-provider-helm(aarch-64)"
RDEPENDS:${PN} += "terraform"

inherit rpm
