SUMMARY = "Kubernetes YAML file manifests for deploying a Ceph cluster"
DESCRIPTION = "This package contains examples of yaml files required to deploy and run the \
Rook-Ceph operator and Ceph clusters in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-k8s-yaml-1.6.2+git0.ge8fd65f08-2.7.noarch.rpm"
RPM_HASH = "dfa22aecd9d040af50c5719dc66f342bbffd80d4aa75d23787b9044980e4231fc70e2083e11b51f9ddda4b0843cc38df49a9faaef5af10c0e2b1c3b231491f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rook-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
