SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.86-1.29.noarch.rpm"
RPM_HASH = "7fb1340e89ee21367d083365799c297977483a0b39de9bd585c013631708405571d2237191511af468532bb625e283ce2da485b62abb9bde793a1cc38bd8e60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"
RDEPENDS:${PN} += ""

inherit rpm
