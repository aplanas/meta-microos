SUMMARY = "Bootloader"
DESCRIPTION = "This pattern holds files required for booting the system"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-bootloader-20200505-41.1.aarch64.rpm"
RPM_HASH = "6c2dac7cf1b04ca26b719ad355468c59b389848c3051020d7133ca1c050f5850bad7c7291f60dc4b306181a9f1bf461438bd3dca8d241c8b2bbe1f2b9791a4c4"

RPROVIDES:${PN} += "pattern() pattern-category() patterns-base-bootloader patterns-base-bootloader(aarch-64)"
RDEPENDS:${PN} += "(grub2-branding-openSUSE if branding-openSUSE) (grub2-snapper-plugin if snapper) grub2 grub2-arm64-efi mokutil shim"

inherit rpm
