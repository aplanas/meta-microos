SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.9_k6.2.12_1"

RPM_NAME = "openafs-kmp-default-1.8.9_k6.2.12_1-2.9.aarch64.rpm"
RPM_HASH = "df13c1a7340801ca206b0b37f1fd081e577ab886eb12f0e7e4267e1d808eab6a4bbba0f61fefd4179efd69fd9d2344bddc93f9abfe9b17054225c9bebbf019e3"

RPROVIDES:${PN} += "kmod(afspag.ko) kmod(libafs.ko) multiversion(kernel) openafs-kmp openafs-kmp-default openafs-kmp-default(aarch-64) openafs-kmp-default-k6.2.12_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r openafs-client suse-kernel-rpm-scriptlets"

inherit rpm
