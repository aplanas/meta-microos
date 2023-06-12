SUMMARY = "Development files for libini_config"
DESCRIPTION = "Library to process config files in INI format into a libcollection data \
structure"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "libini_config-devel-1.3.1-27.18.aarch64.rpm"
RPM_HASH = "307d76bdd3d6941b674150537713464953e33be15ffb543819d1639d402e9653d9156a20773ec2d8a1fad28a3bbf8573921f11d9ca5e6e4c4476cba71f253d26"

RPROVIDES:${PN} += "libini_config-devel \
libini_config-devel(aarch-64) \
pkgconfig(ini_config)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libini_config5 \
pkgconfig(basicobjects) \
pkgconfig(collection) \
pkgconfig(ref_array)"

inherit rpm
