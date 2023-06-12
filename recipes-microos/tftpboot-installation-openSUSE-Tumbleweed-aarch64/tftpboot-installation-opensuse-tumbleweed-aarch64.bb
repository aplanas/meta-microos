SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "tftpboot-installation-openSUSE-Tumbleweed-aarch64-17.87-1.8.noarch.rpm"
RPM_HASH = "cb103d0945804daa4006ae7e8e98de0a6cb59525adab18f31e53018f003c69a6f53abd7a9d95206838187d22f1175da03d161c1b69cae5ff7a398e3c18f2c1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-Tumbleweed-aarch64"
RDEPENDS:${PN} += ""

inherit rpm
