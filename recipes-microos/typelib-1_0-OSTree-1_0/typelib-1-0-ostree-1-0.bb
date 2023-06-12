SUMMARY = "Git for operating system binaries  -- GObject bindings"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "typelib-1_0-OSTree-1_0-2023.2-2.1.aarch64.rpm"
RPM_HASH = "e5c13c3bc2c9d7dfe77163c5cb7a2e42bc9776c3b000054e8f470b361d8f5b825c469b01db7ffdc975dbf198993f0344a81d3e8fd4c8c9396c7dbe48b53e0d8b"

RPROVIDES:${PN} += "typelib(OSTree) typelib-1_0-OSTree-1_0 typelib-1_0-OSTree-1_0(aarch-64)"
RDEPENDS:${PN} += "libostree-1.so.1()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
