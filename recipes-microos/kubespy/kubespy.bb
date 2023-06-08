SUMMARY = "Tools for observing Kubernetes resources in real time, powered by Pulumi"
DESCRIPTION = "What happens when you boot up a Pod? What happens to a Service before it is allocated a public IP address? How often is a Deployment's status changing? \
 \
kubespy is a small tool that makes it easy to observe how Kubernetes resources change in real time, derived from the work we did to make Kubernetes deployments predictable in Pulumi's CLI. Run kubespy at any point in time, and it will watch and report information about a Kubernetes resource continuously until you kill it."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "kubespy-0.6.2-1.1.aarch64.rpm"
RPM_HASH = "b7047b02ce60e7b99433a1560833470f5f323fa5dd6101187eb50c07060a6d3bc5b24e54f3b9e9526ca1e91605e6c3dfb943c28ec427d2bb247323017d52ecca"

RPROVIDES:${PN} += "kubespy kubespy(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
