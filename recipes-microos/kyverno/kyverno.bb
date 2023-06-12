SUMMARY = "CLI and kubectl plugin for Kyverno"
DESCRIPTION = "Kyverno is a policy engine designed for Kubernetes. It can validate, mutate, and generate configurations using admission controls and background scans. Kyverno policies are Kubernetes resources and do not require learning a new language. Kyverno is designed to work nicely with tools you already use like kubectl, kustomize, and Git."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "kyverno-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "26a97d6444f56af4bbe320634fd02e2a0bcfb33cded7915ce4b1ca2bbcbd75450b3bbc4f904aa82b1d6bbe483e836f85085ff63a62f5baced03657f912319323"

RPROVIDES:${PN} += "kyverno kyverno(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
