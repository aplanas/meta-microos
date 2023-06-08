SUMMARY = "Development files for libpath_utils"
DESCRIPTION = "Utility functions to manipulate filesystem pathnames"
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "libpath_utils-devel-0.2.1-27.18.aarch64.rpm"
RPM_HASH = "0136e6ca964545571257e719d0f2aad82ba1d2f2a8769f10e0ea92ce8a77716abcb3ae8558d1af78068df96c863da65add556aef3e1136a9f477c785d131682b"

RPROVIDES:${PN} += "libpath_utils-devel libpath_utils-devel(aarch-64) pkgconfig(path_utils)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpath_utils1"

inherit rpm
