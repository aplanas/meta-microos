SUMMARY = "A Kubernetes cluster resource sanitizer"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases. \
peye is a utility that scans live Kubernetes cluster and reports potential issues with deployed resources and configurations. It sanitizes your cluster based on what's deployed and not what's sitting on disk. By scanning your cluster, it detects misconfigurations and helps you to ensure that best practices are in place, thus preventing future headaches. It aims at reducing the cognitive overload one faces when operating a Kubernetes cluster in the wild. Furthermore, if your cluster employs a metric-server, it reports potential resources over/under allocations and attempts to warn you should your cluster run out of capacity. \
Popeye is a readonly tool, it does not alter any of your Kubernetes resources in any way!"
LICENSE = "Apache-2.0"

PV = "0.11.1"

RPM_NAME = "popeye-0.11.1-1.4.aarch64.rpm"
RPM_HASH = "e24658d9bd3d760c199982aa7c3e27e783ecfaed42466da69cea7671e7cba51a8fd64e4c5d7a91419569ec75140884967f84061bf0223c399248e2d2e02787e3"

RPROVIDES:${PN} += "popeye popeye(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
