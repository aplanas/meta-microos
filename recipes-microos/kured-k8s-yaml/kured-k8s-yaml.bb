SUMMARY = "Kubernetes yaml file to run kured container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
kured container in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kured-k8s-yaml-1.10.2-1.3.noarch.rpm"
RPM_HASH = "5eb23e9a4dd844105f9a066eb163af89ef866658c9412922b495f93985be3afb563a2e79ca13c0d72112dd7d674e7cee2f5f0135747c28aa0271779bc7169c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kured-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
