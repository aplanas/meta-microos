SUMMARY = "A library to measure network performance"
DESCRIPTION = "libiperf gives you access to all the functionality of the iperf3 \
network testing tool. \
You can build it directly into your own program, instead of having \
to run it as a shell command."
LICENSE = "BSD-3-Clause"

PV = "3.13"

RPM_NAME = "libiperf0-3.13-1.2.aarch64.rpm"
RPM_HASH = "76aa0cf6df5cbe232c6f1fd32bacf2adab55bf84a730ec43b2d49d05e0ac55b0d68f424bd6bc2cc80718d0eb5b29ddd05e6d46832d53c3cca9463b8074fe5bf2"

RPROVIDES:${PN} += "libiperf.so.0()(64bit) \
libiperf0 \
libiperf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
