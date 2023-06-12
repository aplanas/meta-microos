SUMMARY = "Kubectl plugin to interactively proxy Kubernetes Services with ease"
DESCRIPTION = "Kubetap is a kubectl plugin that enables an operator to easily deploy intercepting proxies for Kubernetes Services."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "kubetap-0.1.4-1.10.aarch64.rpm"
RPM_HASH = "00f938e4e417c7ff8f023c9c20480b1bad9e544ef9309af8f286c004e0e37bf7e70e932097eed6d1e6419a594bf06f7d143c2f4901f0016d66c9561dadd06f46"

RPROVIDES:${PN} += "kubetap kubetap(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
