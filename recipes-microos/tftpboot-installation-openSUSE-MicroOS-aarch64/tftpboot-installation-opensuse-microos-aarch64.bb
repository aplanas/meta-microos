SUMMARY = "tftp installation tree"
DESCRIPTION = "This package contains the kernel, initrd and installation images \
to install SUSE CaaS Platform with PXE boot/tftpboot on x86-64."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "tftpboot-installation-openSUSE-MicroOS-aarch64-17.86-1.29.noarch.rpm"
RPM_HASH = "cc6e7d014ac45613bf6ca1a75287e159fbe9a1634440516161b4db3f0d5706fb2a23f963b0050cafd6a4df2e354fc97442915b6a31d0b738c3d23450db9e1431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-openSUSE-MicroOS-aarch64"
RDEPENDS:${PN} += ""

inherit rpm
