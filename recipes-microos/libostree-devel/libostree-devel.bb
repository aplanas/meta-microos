SUMMARY = "Git for operating system binaries -- Development files"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-devel-2023.2-2.1.aarch64.rpm"
RPM_HASH = "a60bae4f801a45d2d69c32e8b5a1f7b0801d7fdc3a44f3fe2cf2c7dab387c01bfe5bac0c3f6d939ee2d668837ec71a4f5dd6860ce5a15aa6019341c590f57711"

RPROVIDES:${PN} += "libostree-devel libostree-devel(aarch-64) ostree-devel pkgconfig(ostree-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libostree-1-1 pkgconfig(gio-unix-2.0) typelib-1_0-OSTree-1_0"

inherit rpm
