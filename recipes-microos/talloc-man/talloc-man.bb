SUMMARY = "Samba talloc Library"
DESCRIPTION = "Talloc is a hierarchical, reference counted memory pool system with \
destructors. \
 \
It is the core memory allocator used in Samba."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "talloc-man-2.4.0-3.1.aarch64.rpm"
RPM_HASH = "03bb8178792c5f59ccee8245974a30754dc6a5964abb46faedd9f1a3b5962b921bebbbd40e527ef3d1f04fb41d3134ca5397aa4d8630f79d51ed81decbd56b19"

RPROVIDES:${PN} += "talloc-man talloc-man(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
