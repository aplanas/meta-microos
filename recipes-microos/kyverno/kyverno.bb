SUMMARY = "CLI and kubectl plugin for Kyverno"
DESCRIPTION = "Kyverno is a policy engine designed for Kubernetes. It can validate, mutate, and generate configurations using admission controls and background scans. Kyverno policies are Kubernetes resources and do not require learning a new language. Kyverno is designed to work nicely with tools you already use like kubectl, kustomize, and Git."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "kyverno-1.9.2-1.2.aarch64.rpm"
RPM_HASH = "0bc6e4b2b5c7a2f8568c108bfc0229b8bb9f83c726c75f53707b27fb66191e745b32181964475c2efbd937b7436fbdd20508e134b9ef836c110e5d203656cc42"

RPROVIDES:${PN} += "kyverno kyverno(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
