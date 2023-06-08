SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-scheduler-1.24.13-2.1.aarch64.rpm"
RPM_HASH = "483b173a0c48531d87543f8335e41e5c62c62b387d101d25e989da61156a6d20a48435217656fa21fa2b133d0922e492b4438055d383b54d510c8d726388698e"

RPROVIDES:${PN} += "kubernetes-scheduler-provider kubernetes1.24-scheduler kubernetes1.24-scheduler(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
