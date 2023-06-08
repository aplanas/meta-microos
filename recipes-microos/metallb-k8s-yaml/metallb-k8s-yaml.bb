SUMMARY = "Kubernetes yaml file to run MetalLB container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
MetalLB container in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-k8s-yaml-0.9.5-1.12.noarch.rpm"
RPM_HASH = "f0137280daf39e0c096babd2ae6c98edb0f39da35a2a11ab4ff558acdcba29a05327ce3e3aee9e8f0300993b74e60bf5a30e15358545a974644b4fe75fafa7a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metallb-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
