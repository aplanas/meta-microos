SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-kubelet-1.25.9-1.1.aarch64.rpm"
RPM_HASH = "823d806f24f4f38eb9db79764d4cef2176faa304f104344ecaf2a2b19bee56d3b01fcc0aed2187cc7dfa9493c0bf478b447cc9b2948395419e2206ff58fadf03"

RPROVIDES:${PN} += "kubernetes-kubelet1.25 kubernetes1.25-kubelet kubernetes1.25-kubelet(aarch-64)"
RDEPENDS:${PN} += "cri-runtime kubernetes-kubelet-common libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
