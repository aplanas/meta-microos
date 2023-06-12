SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.87-1.9.noarch.rpm"
RPM_HASH = "5b2c5d597fc0b5209b954d3a20082e9a4f68176b0e7e92b4d5c6b918f64c23040dd10b98cf822b5dca84702d3069b0fac1fb7b5ecd2d74ef95723d9738dfd26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"
RDEPENDS:${PN} += ""

inherit rpm
