SUMMARY = "Tool to run Kubernetes locally"
DESCRIPTION = "Minikube is a tool that allows running Kubernetes locally. Minikube \
runs a single-node Kubernetes cluster inside a VM on your machine for \
users looking to try out Kubernetes or develop with it day-to-day."
LICENSE = "Apache-2.0"

PV = "1.30.1"

RPM_NAME = "minikube-1.30.1-1.2.aarch64.rpm"
RPM_HASH = "c2f8345e1807b1314defd193140a32d972bb87b6baff3f7732245527218c21e0e186611f477111a38b848b155008d53780dae31a952f627f78bc9bc4b5a6f76f"

RPROVIDES:${PN} += "minikube \
minikube(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
