SUMMARY = "Inspect binary from sparse"
DESCRIPTION = "test-inspect is a gtk frontend for sparse."
LICENSE = "MIT"

PV = "0.6.4+20220627"

RPM_NAME = "sparse-inspect-0.6.4+20220627-2.1.aarch64.rpm"
RPM_HASH = "578a33341d384e7ede13ef84dcfbe90159a97358e8cc848741b49cac7bb88f1f008d3b47326812be0b9378eca44d35da22764e798f6f4f537603fe43d85e65dc"

RPROVIDES:${PN} += "sparse-inspect \
sparse-inspect(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
