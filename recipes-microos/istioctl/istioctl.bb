SUMMARY = "CLI for the istio servic mesh in Kubernetes"
DESCRIPTION = "The istioctl tool is a configuration command line utility that allows service operators to debug and diagnose their Istio service mesh deployments. The Istio project also includes two helpful scripts for istioctl that enable auto-completion for Bash and ZSH. Both of these scripts provide support for the currently available istioctl commands."
LICENSE = "Apache-2.0"

PV = "1.17.2"

RPM_NAME = "istioctl-1.17.2-2.1.aarch64.rpm"
RPM_HASH = "308568593a337854b7cfa7ca467e7ca4d6c969a4c61e7174e08bcfe3e1fbeba61c6950535769fa36773ed64bf9656f50716064d52e894d17770db6a986cddfed"

RPROVIDES:${PN} += "istioctl istioctl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
