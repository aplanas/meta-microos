SUMMARY = "Wrapper around the C libyaml library"
DESCRIPTION = "This module provides a thin wrapper around the C libyaml API. \
 \
Currently it provides functions for parsing and emitting events. \
 \
libyaml also provides a loader/dumper API to load/dump YAML into a list of \
nodes. There's no wrapper for these functions yet. \
 \
This is just one of the first releases. The function names will eventually \
be changed. \
 \
The sources of 'libyaml-dev' are included in this distribution. You can \
build this module with the system libyaml instead, if you remove the \
libyaml sources and call 'Makefile.PL' with 'WITH_SYSTEM_LIBYAML=1'."
LICENSE = "MIT"

PV = "0.013"

RPM_NAME = "perl-YAML-LibYAML-API-0.013-1.8.aarch64.rpm"
RPM_HASH = "4996d4739e24ac1b2f6f4bc0b5fb810e339457e1ee57a82a3d635793bb25de9076a6e403f528c6b5e939d8e6f510620d7df4c51b78db234484ac3d7a116d4785"

RPROVIDES:${PN} += "perl(YAML::LibYAML::API) perl(YAML::LibYAML::API::XS) perl-YAML-LibYAML-API perl-YAML-LibYAML-API(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(YAML::PP::Common)"

inherit rpm
