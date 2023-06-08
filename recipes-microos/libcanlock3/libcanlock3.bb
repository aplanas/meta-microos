SUMMARY = "Library for creating and verifying Usenet cancel locks"
DESCRIPTION = "libcanlock is a library for creating and verifying RFC 8315 Netnews \
Cancel-Locks. This implementation uses the recommended algorithm from \
Section 4 with HMAC based on the same hash function as <scheme>. \
 \
This subpackage contains shared library part of libcanlock."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "libcanlock3-3.3.0-1.3.aarch64.rpm"
RPM_HASH = "cf825f704f884b731a394cf8cb44fa07051d5c0bde7fa8147a49f9a316189fd3df317a6f354fd8fc2b4f724466ef9c051accfaa85d8a2d0c70fb22a60c309061"

RPROVIDES:${PN} += "libcanlock-hp.so.3()(64bit) libcanlock.so.3()(64bit) libcanlock3 libcanlock3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit)"

inherit rpm
