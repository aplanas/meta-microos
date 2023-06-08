SUMMARY = "Easily check your cluster for use of deprecated APIs"
DESCRIPTION = "Easily check your cluster for use of deprecated APIs \
 \
Kubernetes 1.16 is slowly starting to roll out, not only across various managed Kubernetes offerings, and with that come a lot of API deprecations1. \
 \
Kube No Trouble (kubent) is a simple tool to check whether you're using any of these API versions in your cluster and therefore should upgrade your workloads first, before upgrading your Kubernetes cluster. \
 \
This tool will be able to detect deprecated APIs depending on how you deploy your resources, as we need the original manifest to be stored somewhere. In particular following tools are supported: \
* file - local manifests in YAML or JSON \
* kubectl - uses the kubectl.kubernetes.io/last-applied-configuration annotation \
* Helm v2 - uses Tiller manifests stored in K8s Secrets or ConfigMaps \
* Helm v3 - uses Helm manifests stored as Secrets or ConfigMaps directly in individual namespaces"
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "kube-no-trouble-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "f968f7f58805e3006825085880b38f8d4e7a6f5632b8e00bf1e06ee968d7a843125dbf885411583f8a337aa2041bc48163d36083ef08bb8c8b4e859c193e8cbd"

RPROVIDES:${PN} += "kube-no-trouble kube-no-trouble(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
