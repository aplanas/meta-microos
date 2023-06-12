SUMMARY = "Unsupported modules for arm64-efi"
DESCRIPTION = "Unsupported modules for grub2-arm64-efi"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-extras-2.06-53.1.noarch.rpm"
RPM_HASH = "3ede866769e493d2fe276c0c842372edf8a1ffe5cde4f7ea59a9d4460ca9d7519821c2b28e5aa26660e5cacffb74d7bfc8dd2c15ddd6840410213c55c2488574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-extras grub2-arm64-efi:/usr/share/grub2/arm64-efi/zfs.mod grub2-arm64-efi:/usr/share/grub2/arm64-efi/zfscrypt.mod grub2-arm64-efi:/usr/share/grub2/arm64-efi/zfsinfo.mod"
RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
