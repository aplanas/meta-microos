SUMMARY = "Perl YAML Serialization using XS and libyaml"
DESCRIPTION = "Perl YAML Serialization using XS and libyaml"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.86"

RPM_NAME = "perl-YAML-LibYAML-0.86-1.3.aarch64.rpm"
RPM_HASH = "33be86e1255787cb443d99742f66ce9cbece0f44428a113d377bad34bea550366e3277522f02d2b61fb771470096c48c46c175f46128d959f640c5f57d033516"

RPROVIDES:${PN} += "perl(YAML::LibYAML) perl(YAML::XS) perl(YAML::XS::LibYAML) perl-YAML-LibYAML perl-YAML-LibYAML(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
