SUMMARY = "Libraries and Header Files to Develop Programs with talloc2 Support"
DESCRIPTION = "Talloc is a hierarchical, reference counted memory pool system with \
destructors. \
 \
It is the core memory allocator used in Samba. \
 \
Libraries and Header Files to Develop Programs with talloc2 Support."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "libtalloc-devel-2.4.0-3.1.aarch64.rpm"
RPM_HASH = "8b5056b9f92be2e12fc9d45acc435d7730d180d24e497f3ad931ae2b07d7f1c074898818ece94e150ec383e0495f92236d0afe046b1bd9358222b4e0969c4ee8"

RPROVIDES:${PN} += "libtalloc-devel \
libtalloc-devel(aarch-64) \
pkgconfig(talloc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtalloc2 \
pkg-config"

inherit rpm
