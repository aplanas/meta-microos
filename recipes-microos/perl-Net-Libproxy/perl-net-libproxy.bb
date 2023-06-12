SUMMARY = "Perl bindings for libproxy"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This package contains the Perl for libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "perl-Net-Libproxy-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "1600c3d77418cf0d8bef37bcc24741f2e539cb3e906cc6a3773570e98427504afe97e840991d3e5eb3db163b559f6a2a112538b13875c6b49c935693353ecbe7"

RPROVIDES:${PN} += "perl(Net::Libproxy) perl-Net-Libproxy perl-Net-Libproxy(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) libproxy1 perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
