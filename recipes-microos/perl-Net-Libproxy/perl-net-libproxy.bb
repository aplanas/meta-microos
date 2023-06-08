SUMMARY = "Perl bindings for libproxy"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This package contains the Perl for libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "perl-Net-Libproxy-0.4.18-1.6.aarch64.rpm"
RPM_HASH = "3f25e54e52b8232a087d9c01b5373e4bae9f17f5041b6107690263d069c7f37fade58f1da2ee00c2cbb2efaf3d4045add7c56ec40004a012b5861ffd748cb42a"

RPROVIDES:${PN} += "perl(Net::Libproxy) perl-Net-Libproxy perl-Net-Libproxy(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) libproxy1 perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
