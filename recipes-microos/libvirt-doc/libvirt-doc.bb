SUMMARY = "API reference and website documentation for libvirt"
DESCRIPTION = "The API reference for the libvirt C library, and a \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-doc-9.4.0-1.1.noarch.rpm"
RPM_HASH = "e29ba871a69add48168eeacbc76038cd2ad6aacc407b05708d68b0f3ea4df33561bdb20645546188222c813e09135b2a2199b13fbba8b898ae403a0df1afe789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"
RDEPENDS:${PN} += ""

inherit rpm
