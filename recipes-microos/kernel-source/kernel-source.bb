SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-source-6.3.1-1.2.noarch.rpm"
RPM_HASH = "ffc52200607e44943a5727601f729cf11747e6009f0b7b11d5aaf98513021288ff5cefd5d255be814c85187535f37ac8223aa38dc8ecd7476e2e9008bab023f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source kernel-source-srchash-8a31779f5544166bb801a03085764c84a737a62d linux multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils kernel-devel sed"

inherit rpm
