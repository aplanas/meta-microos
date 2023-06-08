SUMMARY = "Kubernetes yaml file to run rbac-manager"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
rbac-manager in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "rbac-manager-k8s-yaml-1.4.2-1.3.noarch.rpm"
RPM_HASH = "fd31a1ecd4f889c3b56b497fe9b83079fadb386d3cce5adb597a2e53200b7d810960794d40b82a60c64ac107f5db6c2df8e317d2daed33673a264942dfb8a5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbac-manager-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
