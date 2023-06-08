SUMMARY = "Docker-compatible CLI for containerd"
DESCRIPTION = "nerdctl is a Docker-compatible CLI for containerd."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "nerdctl-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "d09a57c4090e24724a2a132ddb809d26effa413564955733c1bafe3f9a9144b57e3bdea445cbb2e309c31ba748bdf28b947f5a27fc8a5acc185c6819454e05e3"

RPROVIDES:${PN} += "nerdctl nerdctl(aarch-64)"
RDEPENDS:${PN} += "/bin/sh buildkit cni-plugins containerd iptables libc.so.6(GLIBC_2.34)(64bit) rootlesskit slirp4netns"

inherit rpm
