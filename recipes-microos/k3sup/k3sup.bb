SUMMARY = "Bootstrap Kubernetes with k3s over SSH < 1 min"
DESCRIPTION = "k3sup is a light-weight utility to get from zero to KUBECONFIG with k3s on any local or remote VM. All you need is ssh access and the k3sup binary to get kubectl access immediately. \
The tool is written in Go and is cross-compiled for Linux, Windows, MacOS and even on Raspberry Pi. \
How do you say it? Ketchup, as in tomato."
LICENSE = "MIT"

PV = "0.12.12"

RPM_NAME = "k3sup-0.12.12-1.1.aarch64.rpm"
RPM_HASH = "f8100a037f93fa5de6423f397e7a05eaf6a574f9fea231b19ef1b383de7f357dd4d7b60c8576c0a5a1968574c2775e3e727f6bd69d7d0422c58b92c878b237e4"

RPROVIDES:${PN} += "k3sup k3sup(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
