SUMMARY = "Bootstrap Kubernetes with k3s over SSH < 1 min"
DESCRIPTION = "k3sup is a light-weight utility to get from zero to KUBECONFIG with k3s on any local or remote VM. All you need is ssh access and the k3sup binary to get kubectl access immediately. \
The tool is written in Go and is cross-compiled for Linux, Windows, MacOS and even on Raspberry Pi. \
How do you say it? Ketchup, as in tomato."
LICENSE = "MIT"

PV = "0.12.7"

RPM_NAME = "k3sup-0.12.7-1.3.aarch64.rpm"
RPM_HASH = "74e94a26075ed5a4f358fe807db461866ec7d02fff23cf145c5cac0442d31ecbdfa64be58490bbe05bac643efda02c68afd4d78479f1b099eaf13a0223869959"

RPROVIDES:${PN} += "k3sup k3sup(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
