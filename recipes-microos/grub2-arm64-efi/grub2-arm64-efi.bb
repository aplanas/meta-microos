SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-2.06-51.1.noarch.rpm"
RPM_HASH = "3aed1837649790e69f191122457eebb2d34366e918970c947981ea07990273a393b9710fdb242317c3e44ae570fd81d6e25a4097dea316c6463dda86ed52b7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi grub2-efi"
RDEPENDS:${PN} += "/bin/sh efibootmgr grub2"

inherit rpm
