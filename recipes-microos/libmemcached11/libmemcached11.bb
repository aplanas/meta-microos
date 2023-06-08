SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached11-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "70713513231a4049737ab53772a6d43965bcacbaf0036cf012809ef40b9229a6a420f801c13e9c7efb2b7b0f87d78ad8aa44c09628390736b608d48f688ab883"

RPROVIDES:${PN} += "libmemcached.so.11()(64bit) libmemcached11 libmemcached11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhashkit.so.2()(64bit) libsasl2.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
