SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-scheduler-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "90725380496ab45498c5519321f97bf5bcb2c5e6df8873fa5dd12ca9d6a6293aa1d54ff8828d41aacb4bb0a7c1e583720b73ce8c7ae40322d4b82c2d5bc43a22"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.20-scheduler kubernetes1.20-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
