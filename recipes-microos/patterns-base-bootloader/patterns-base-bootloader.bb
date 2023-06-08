SUMMARY = "Bootloader"
DESCRIPTION = "This pattern holds files required for booting the system"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-bootloader-20200505-40.1.aarch64.rpm"
RPM_HASH = "8f6a6ad7fb48f00b38e8606cc73d5eb1df704f28fdce89c677806a4316aa7ccb72e2b8c4a11a74339f6c82fe4fc51e8cf428be7daa6d732f592e0fa347693543"

RPROVIDES:${PN} += "pattern() pattern-category() patterns-base-bootloader patterns-base-bootloader(aarch-64)"
RDEPENDS:${PN} += "(grub2-branding-openSUSE if branding-openSUSE) (grub2-snapper-plugin if snapper) grub2 grub2-arm64-efi mokutil shim"

inherit rpm
