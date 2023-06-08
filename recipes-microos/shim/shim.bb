SUMMARY = "UEFI shim loader"
DESCRIPTION = "shim is a trivial EFI application that, when run, attempts to open and \
execute another application."
LICENSE = "BSD-2-Clause"

PV = "15.7"

RPM_NAME = "shim-15.7-6.1.aarch64.rpm"
RPM_HASH = "0b8969b1758cd329ddee5ae544b552a3fe28ac4856d309cb234e369c22a2014f8a9b322faf02dc8e9faed9bc73e8bbdfa2830550c11e4c563cdc83c0ca25907d"

RPROVIDES:${PN} += "shim shim(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh grub2-arm64-efi mokutil"

inherit rpm
