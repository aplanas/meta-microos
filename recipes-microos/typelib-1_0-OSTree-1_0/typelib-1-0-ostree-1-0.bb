SUMMARY = "Git for operating system binaries  -- GObject bindings"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "typelib-1_0-OSTree-1_0-2023.2-1.1.aarch64.rpm"
RPM_HASH = "77d84c55c9a3022e03c1e7248ccd87c3abc44e91c743c306c40caee17c256a707bdaeeee9d7f85f72e1a5c242dc29752ff4637fd737a85bc636b34ae7ef4b5ba"

RPROVIDES:${PN} += "typelib(OSTree) typelib-1_0-OSTree-1_0 typelib-1_0-OSTree-1_0(aarch-64)"
RDEPENDS:${PN} += "libostree-1.so.1()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
