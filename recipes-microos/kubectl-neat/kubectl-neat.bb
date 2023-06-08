SUMMARY = "Clean up Kubernetes yaml and json output to make it readable"
DESCRIPTION = "Remove clutter from Kubernetes manifests to make them more readable."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "kubectl-neat-2.0.3-1.8.aarch64.rpm"
RPM_HASH = "c135614831523fd76e47ec5b54e5f1111492c45345c9418b544c0d6008738d8f64ab838b9a0b07dd55c0f6e1ae92c0411543879f706038884b97d5f0dc4c6731"

RPROVIDES:${PN} += "kubectl-neat kubectl-neat(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
