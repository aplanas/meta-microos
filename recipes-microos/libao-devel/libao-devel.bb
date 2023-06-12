SUMMARY = "Development files for libao, an audio outputl ibrary"
DESCRIPTION = "This package contains the headers for developing applications that \
want to make use of libao."
LICENSE = "GPL-2.0+"

PV = "1.2.2+git20180114.d522165"

RPM_NAME = "libao-devel-1.2.2+git20180114.d522165-2.19.aarch64.rpm"
RPM_HASH = "edd6b2e8d9dab04192ee7dda773eb644674f4e4808e7083948e6e030cee322621bf10e52700ed5097f208cbabea2a677145caa92211fd9e3c065cd79a895977d"

RPROVIDES:${PN} += "libao-devel \
libao-devel(aarch-64) \
pkgconfig(ao)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libao4"

inherit rpm
