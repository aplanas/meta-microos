SUMMARY = "The XML-Parse library"
DESCRIPTION = "XML parser with support for Vala iterators."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.12"

RPM_NAME = "libxmlbird1-1.2.12-1.3.aarch64.rpm"
RPM_HASH = "297641a9f3ccce6b99c298cbff40a642339c287cf9c9d0ec9077db91eeade07779d4e110b65854a4eebaf14f33eda754a1b5313408040599298b02335b2ac8c7"

RPROVIDES:${PN} += "libxmlbird.so.1()(64bit) libxmlbird1 libxmlbird1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
