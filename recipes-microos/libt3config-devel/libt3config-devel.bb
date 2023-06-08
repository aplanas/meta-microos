SUMMARY = "Development files for libt3config, a library for reading/writing config files"
DESCRIPTION = "The libt3config library provides functions for reading and writing \
simple structured configuration files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3config."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "libt3config-devel-1.0.0-1.14.aarch64.rpm"
RPM_HASH = "5cd5324b49436a920ef0be8d51e5f0ff14d191aa3cf5d36da34bd6430e8f287bb777647c45c27c810d5683c1d9ce8c682b327268757afe7929d3dcad60cafe4a"

RPROVIDES:${PN} += "libt3config-devel libt3config-devel(aarch-64) pkgconfig(libt3config)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libt3config0"

inherit rpm
