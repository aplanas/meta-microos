SUMMARY = "GObject wrapper around the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the GObject library."
LICENSE = "MIT"

PV = "7.2.0"

RPM_NAME = "libharfbuzz-gobject0-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "27a9855e334c63813672ca4de4a8ec0fb17017a447d53de7622db42371a0ac2b051387252f6fa432d558090fb120da58e34679863e2f91e22a3b3f2f0cde2793"

RPROVIDES:${PN} += "libharfbuzz-gobject.so.0()(64bit) libharfbuzz-gobject0 libharfbuzz-gobject0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libharfbuzz.so.0()(64bit)"

inherit rpm
