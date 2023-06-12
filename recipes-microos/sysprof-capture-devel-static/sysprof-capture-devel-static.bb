SUMMARY = "Library to read and write syspref's capture format"
DESCRIPTION = "This static library allows external tooling to read and write the \
syspref's capture format."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-capture-devel-static-3.48.0-2.1.aarch64.rpm"
RPM_HASH = "2cf3f5fb61ee0dd1ed24d403b8a4cef1bce0fd0be1f44eca2b88507b361c6305f931a644addef66c7f11eaa5dc48d7c112fde86b8745ee522191b548e8717e91"

RPROVIDES:${PN} += "pkgconfig(sysprof-capture-4) \
sysprof-capture-devel-static \
sysprof-capture-devel-static(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
