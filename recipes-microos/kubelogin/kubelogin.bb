SUMMARY = "Kubernetes client credential plugin implementing Azure authentication"
DESCRIPTION = "A client-go credential (exec) plugin implementing azure authentication. This plugin provides features \
that are not available in kubectl. It is supported on kubectl v1.11+"
LICENSE = "MIT"

PV = "0.0.24"

RPM_NAME = "kubelogin-0.0.24-1.3.aarch64.rpm"
RPM_HASH = "5d16693704bc568100611c51a138501f484cddbed19e5ee09bb3ca10d3a5f4eed69eea5bdc965e77947aaebbd8102f1f410380b69bddee30898f959c72b8fcf2"

RPROVIDES:${PN} += "kubelogin kubelogin(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
