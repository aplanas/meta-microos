SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "This is the second version of the GRUB (Grand Unified Bootloader), a \
highly configurable and customizable bootloader with modular \
architecture.  It support rich scale of kernel formats, file systems, \
computer architectures and hardware devices. \
 \
This package includes user space utlities to manage GRUB on your system."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-2.06-51.1.aarch64.rpm"
RPM_HASH = "d5a0d6d990095661237729df2e1ba6f255fab03ea40603992f0ae8e47cd114432c8bc61346c3203cf4d8f316b3a2e23b0144c6a6b0f1c8aa874f32cef17728b9"

RPROVIDES:${PN} += "config(grub2) grub2 grub2(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl gettext-runtime libc.so.6(GLIBC_2.34)(64bit) libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libfreetype.so.6()(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.6)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libtasn1.so.6()(64bit) libtasn1.so.6(LIBTASN1_0_3)(64bit)"

inherit rpm
