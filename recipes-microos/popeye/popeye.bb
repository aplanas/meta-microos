SUMMARY = "A Kubernetes cluster resource sanitizer"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases. \
peye is a utility that scans live Kubernetes cluster and reports potential issues with deployed resources and configurations. It sanitizes your cluster based on what's deployed and not what's sitting on disk. By scanning your cluster, it detects misconfigurations and helps you to ensure that best practices are in place, thus preventing future headaches. It aims at reducing the cognitive overload one faces when operating a Kubernetes cluster in the wild. Furthermore, if your cluster employs a metric-server, it reports potential resources over/under allocations and attempts to warn you should your cluster run out of capacity. \
Popeye is a readonly tool, it does not alter any of your Kubernetes resources in any way!"
LICENSE = "Apache-2.0"

PV = "0.11.1"

RPM_NAME = "popeye-0.11.1-1.3.aarch64.rpm"
RPM_HASH = "028398b83d5c51b65e1d657224917a9b2df735793d3a7fad895ec72d6c0358ab1fea1f7c7c4efee551006af2af656cdbf61852bb045559227e4a51bf96853791"

RPROVIDES:${PN} += "popeye popeye(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
