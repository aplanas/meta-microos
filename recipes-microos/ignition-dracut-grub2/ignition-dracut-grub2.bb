SUMMARY = "Files to trigger ignition firstboot with grub2"
DESCRIPTION = "GRUB2 configuration which sets ignition.firstboot based on \
/boot/writable/firstboot_happened and ignition.firstboot and a matching service \
which creates firstboot_happened after the first boot."
LICENSE = "Apache-2.0"

PV = "2.15.0"

RPM_NAME = "ignition-dracut-grub2-2.15.0-2.3.aarch64.rpm"
RPM_HASH = "9bdedda097ab9a6a69674cd2b8610c249ab8e59ea06538151f63ae7976447e28a50fb771d7d1bbb0b83aa4e793f2f5579f94d7cb4878e94c9637730e59b5a819"

RPROVIDES:${PN} += "ignition-dracut-grub2 ignition-dracut-grub2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh grub2 sed"

inherit rpm
