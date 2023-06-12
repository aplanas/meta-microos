SUMMARY = "Development Files for libnma-gtk4"
DESCRIPTION = "Development Files for libnma-gtk4."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-gtk4-devel-1.10.6-1.3.aarch64.rpm"
RPM_HASH = "7ab5fe14636e562d92f6dbf46cf4707651ab2893922d240fb96464c0cb471312519f7d4ba3cc283500845a43b6f518dfd08a72f7c92af35b3199b40493b9f61c"

RPROVIDES:${PN} += "libnma-gtk4-devel \
libnma-gtk4-devel(aarch-64) \
pkgconfig(libnma-gtk4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnma-devel \
libnma-gtk4-0 \
pkgconfig(libnm) \
typelib-1_0-NMA4-1_0"

inherit rpm
