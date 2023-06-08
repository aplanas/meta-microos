SUMMARY = "FRRouting fpm protobuf library"
DESCRIPTION = "This library contains forwarding plane manager protobuf definitions \
for FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrfpm_pb0-8.4-3.1.aarch64.rpm"
RPM_HASH = "58770d0937521e1e977cc3d11d48c8a0d97c372284301d74ec50a90e9300561e9731efd0027b2c06ea5900c7c64f42b53ad94e4bbcf3a99dd31aa8a18892c145"

RPROVIDES:${PN} += "libfrrfpm_pb.so.0()(64bit) libfrrfpm_pb0 libfrrfpm_pb0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
