SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.9_k6.2.12_1"

RPM_NAME = "openafs-kmp-64kb-1.8.9_k6.2.12_1-2.9.aarch64.rpm"
RPM_HASH = "43b5eb1e66fb3a690e4315e5213dd814ea9c2ddd3614d0e8b3c70f5acc919f1e29da803e566c76538109c4ac7abd6d13a4a83f1dd596b8a9200bfb1946322307"

RPROVIDES:${PN} += "kmod(afspag.ko) kmod(libafs.ko) multiversion(kernel) openafs-kmp openafs-kmp-64kb openafs-kmp-64kb(aarch-64) openafs-kmp-64kb-k6.2.12_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r openafs-client suse-kernel-rpm-scriptlets"

inherit rpm
