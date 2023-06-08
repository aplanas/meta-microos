SUMMARY = "Igusa (genus 2) class polynomial computation library"
DESCRIPTION = "This library package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
It includes libraries that can be called from within a C program. \
This subpackage provides the development headers for CM."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "libcmh0-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "082f43f7eb81af6bf2e331fb99bc3ed181a9b6d80c0fa4202e44b9f709ef284d8bdbeb83e6397d48a81bb2da286f886118203f38aac319cbcb70e8293969b1ed"

RPROVIDES:${PN} += "libcmh.so.0()(64bit) libcmh0 libcmh0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit)"

inherit rpm
