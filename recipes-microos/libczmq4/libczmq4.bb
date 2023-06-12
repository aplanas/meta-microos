SUMMARY = "Shared library of czmq"
DESCRIPTION = "CZMQ is a higher-level binding for the ZeroMQ core API. \
 \
* It wraps the ZeroMQ core API in semantics that lead to shorter, \
  more readable applications. \
* It hides, as far as possible, the differences between different \
  versions of ZeroMQ (2.x, 3.x, 4.x). \
* It provides a space for development of more sophisticated API \
  semantics. \
* It wraps the ZeroMQ security features with high-level tools and \
  APIs. \
* It is the basis for other language bindings built on top of CZMQ."
LICENSE = "MPL-2.0"

PV = "4.2.1"

RPM_NAME = "libczmq4-4.2.1-1.8.aarch64.rpm"
RPM_HASH = "3da1aa61de7afe580a8a5f324efc87ec0fb5bbe4b458b6532bca8720ad0f83af0119c73556c620c3c97659296c12653ce696557fce560c92b9489d615bc572dd"

RPROVIDES:${PN} += "libczmq.so.4()(64bit) \
libczmq4 \
libczmq4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblz4.so.1()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libzmq.so.5()(64bit)"

inherit rpm
