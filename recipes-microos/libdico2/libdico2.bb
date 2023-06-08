SUMMARY = "Shared library for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains shared library for dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "libdico2-2.11-1.15.aarch64.rpm"
RPM_HASH = "f22700236e77be3283bd0f51659ca901b4618c8cef1edd67cd7d61e0cbb1e7801cf39317a741434e87eefda76f9773aca623859a9d37b3c331e17a4e836eb12f"

RPROVIDES:${PN} += "libdico.so.2()(64bit) libdico2 libdico2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
