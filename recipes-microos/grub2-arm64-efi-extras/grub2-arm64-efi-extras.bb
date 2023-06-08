SUMMARY = "Unsupported modules for arm64-efi"
DESCRIPTION = "Unsupported modules for grub2-arm64-efi"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-extras-2.06-51.1.noarch.rpm"
RPM_HASH = "6a279cdcd86570efd614457f55d6e923bb2686e8819a0a9ef982d65d3e371873cf11ee64b6f659803b6f281c97cf64d403c65b371e1eb0a1c609b82c0b214c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-extras grub2-arm64-efi:/usr/share/grub2/arm64-efi/zfs.mod grub2-arm64-efi:/usr/share/grub2/arm64-efi/zfscrypt.mod grub2-arm64-efi:/usr/share/grub2/arm64-efi/zfsinfo.mod"
RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
