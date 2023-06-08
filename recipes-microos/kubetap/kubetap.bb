SUMMARY = "Kubectl plugin to interactively proxy Kubernetes Services with ease"
DESCRIPTION = "Kubetap is a kubectl plugin that enables an operator to easily deploy intercepting proxies for Kubernetes Services."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "kubetap-0.1.4-1.9.aarch64.rpm"
RPM_HASH = "28c8dbf17f1630a19e31bd7a6e546241ba1581bdb60119849ea2c59122f358f58cd0ac7e95876c4266f20ea5cd2ee07dd4f09dc11fcd3cb023aa0b9ddf57e638"

RPROVIDES:${PN} += "kubetap kubetap(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
