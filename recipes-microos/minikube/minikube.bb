SUMMARY = "Tool to run Kubernetes locally"
DESCRIPTION = "Minikube is a tool that allows running Kubernetes locally. Minikube \
runs a single-node Kubernetes cluster inside a VM on your machine for \
users looking to try out Kubernetes or develop with it day-to-day."
LICENSE = "Apache-2.0"

PV = "1.30.1"

RPM_NAME = "minikube-1.30.1-1.1.aarch64.rpm"
RPM_HASH = "0865398daa74067c38cb053a5e6f5f103fe79662403551e9916adc2b6e485c8ae086507b3b90f4334598a26020ce5c76559c559682f410ef17012854690ab37b"

RPROVIDES:${PN} += "minikube minikube(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
