SUMMARY = "UEFI QEMU rom image (AArch64)"
DESCRIPTION = "This package contains the UEFI rom image (AArch64) for QEMU cortex-a57 \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-uefi-aarch64-202302-2.2.noarch.rpm"
RPM_HASH = "0488b3fd929356ce41d1935f169656e5f201bb8fc0425544c4c0b0062cb498b28db87f4c6ee082a285c14187ce0d5df781a5abf530cf9c2804bf1d2d983b49aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-aarch64"
RDEPENDS:${PN} += ""

inherit rpm
