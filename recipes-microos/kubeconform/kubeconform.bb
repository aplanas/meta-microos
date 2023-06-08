SUMMARY = "A fast Kubernetes manifests validator, with support for custom resources"
DESCRIPTION = "Kubeconform is a Kubernetes manifests validation tool. It is inspired by, contains \
code from and is designed to stay close to Kubeval, but with the following \
improvements: \
 \
- high performance: will validate & download manifests over multiple routines, caching \
  downloaded files in memory \
- configurable list of remote, or local schemas locations, enabling validating Kubernetes \
  custom resources (CRDs) and offline validation capabilities \
- uses by default a self-updating fork of the schemas registry maintained by the \
  kubernetes-json-schema project - which guarantees up-to-date schemas for all recent versions \
  of Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "kubeconform-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "7098727a7cfeeee275ad459e9293836ae1c4237d5cf11fbfe657f32ba13a15447d3e81f0c3125f10dfd03c66e084b9bb9d584353e5a14ef7896903c561bd5f4d"

RPROVIDES:${PN} += "kubeconform kubeconform(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
