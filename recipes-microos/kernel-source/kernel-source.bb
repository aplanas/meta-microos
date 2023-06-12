SUMMARY = "The Linux Kernel Sources"
DESCRIPTION = "Linux kernel sources with many fixes and improvements. \
 \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-source-6.3.4-1.1.noarch.rpm"
RPM_HASH = "7cb788c47906fd9fc9606a40b2a0c38647bb0682aa281c4d0ab344ae7221494aefa810ca3b659832c9f547dfa41bbe09450c16f3043b7d791b0d30ab5dd96f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source kernel-source-srchash-2c66b1f470678d30f7dc560d1f3770e6e13b5e65 linux multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils kernel-devel sed"

inherit rpm
