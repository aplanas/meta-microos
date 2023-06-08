SUMMARY = "Git for operating system binaries -- Development files"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-devel-2023.2-1.1.aarch64.rpm"
RPM_HASH = "d6201621ddba010e48b7c29a81cd54e8076ba3a8b344dbc56c178c104bbed43be5e2176563a1626b66934dc06970b9b481312d83004dfb727d4db56d4e0e89d6"

RPROVIDES:${PN} += "libostree-devel libostree-devel(aarch-64) ostree-devel pkgconfig(ostree-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libostree-1-1 pkgconfig(gio-unix-2.0) typelib-1_0-OSTree-1_0"

inherit rpm
