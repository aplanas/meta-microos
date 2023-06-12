SUMMARY = "Files to trigger ignition firstboot with grub2"
DESCRIPTION = "GRUB2 configuration which sets ignition.firstboot based on \
/boot/writable/firstboot_happened and ignition.firstboot and a matching service \
which creates firstboot_happened after the first boot."
LICENSE = "Apache-2.0"

PV = "2.15.0"

RPM_NAME = "ignition-dracut-grub2-2.15.0-2.4.aarch64.rpm"
RPM_HASH = "149a60b3a64cf4e737149b016c9e75316db0f32fbee69226ba2325f1394b93f8d76e8e318182f778f510598c738116f87910ce1dc7a4e32d1af00b9a02b1203f"

RPROVIDES:${PN} += "ignition-dracut-grub2 ignition-dracut-grub2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh grub2 sed"

inherit rpm
