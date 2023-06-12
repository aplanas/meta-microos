SUMMARY = "Samba talloc library"
DESCRIPTION = "Talloc is a hierarchical, reference counted memory pool system with \
destructors. \
 \
It is the core memory allocator used in Samba. \
 \
This package includes the talloc2 library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "libtalloc2-2.4.0-3.1.aarch64.rpm"
RPM_HASH = "db34074f7833b9c231668fc74a4ff7cf14ad042a1558764b07a40735766e9faeacd4eff910cb0472cd456ee3941e98494501fbb3cd4ae36f147a06c1e3e467a7"

RPROVIDES:${PN} += "bundled(libreplace) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtalloc.so.2(TALLOC_2.0.3)(64bit) \
libtalloc.so.2(TALLOC_2.0.4)(64bit) \
libtalloc.so.2(TALLOC_2.0.5)(64bit) \
libtalloc.so.2(TALLOC_2.0.6)(64bit) \
libtalloc.so.2(TALLOC_2.0.7)(64bit) \
libtalloc.so.2(TALLOC_2.0.8)(64bit) \
libtalloc.so.2(TALLOC_2.1.0)(64bit) \
libtalloc.so.2(TALLOC_2.1.1)(64bit) \
libtalloc.so.2(TALLOC_2.1.10)(64bit) \
libtalloc.so.2(TALLOC_2.1.11)(64bit) \
libtalloc.so.2(TALLOC_2.1.12)(64bit) \
libtalloc.so.2(TALLOC_2.1.13)(64bit) \
libtalloc.so.2(TALLOC_2.1.14)(64bit) \
libtalloc.so.2(TALLOC_2.1.15)(64bit) \
libtalloc.so.2(TALLOC_2.1.16)(64bit) \
libtalloc.so.2(TALLOC_2.1.2)(64bit) \
libtalloc.so.2(TALLOC_2.1.3)(64bit) \
libtalloc.so.2(TALLOC_2.1.4)(64bit) \
libtalloc.so.2(TALLOC_2.1.5)(64bit) \
libtalloc.so.2(TALLOC_2.1.6)(64bit) \
libtalloc.so.2(TALLOC_2.1.7)(64bit) \
libtalloc.so.2(TALLOC_2.1.8)(64bit) \
libtalloc.so.2(TALLOC_2.1.9)(64bit) \
libtalloc.so.2(TALLOC_2.2.0)(64bit) \
libtalloc.so.2(TALLOC_2.3.0)(64bit) \
libtalloc.so.2(TALLOC_2.3.1)(64bit) \
libtalloc.so.2(TALLOC_2.3.2)(64bit) \
libtalloc.so.2(TALLOC_2.3.3)(64bit) \
libtalloc.so.2(TALLOC_2.3.4)(64bit) \
libtalloc.so.2(TALLOC_2.3.5)(64bit) \
libtalloc.so.2(TALLOC_2.4.0)(64bit) \
libtalloc2 \
libtalloc2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
