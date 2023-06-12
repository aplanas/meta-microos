SUMMARY = "Development files for vamp-plugin-sdk"
DESCRIPTION = "The vamp-plugin-sdk-devel package contains documentation examples and \
header files for developing applications that use vamp-plugin-sdk."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "vamp-plugin-sdk-devel-2.10.0-1.12.aarch64.rpm"
RPM_HASH = "40109c7eb1086a806de6881f610c4756f568d503a53470f460c3424c993b510029aaca53b231681eed028a9384898479c68735e76867c6783544a370aad6cadb"

RPROVIDES:${PN} += "pkgconfig(vamp) \
pkgconfig(vamp-hostsdk) \
pkgconfig(vamp-sdk) \
vamp-plugin-sdk-devel \
vamp-plugin-sdk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvamp-hostsdk3 \
libvamp-sdk2 \
pkgconfig \
vamp-plugin-sdk"

inherit rpm
