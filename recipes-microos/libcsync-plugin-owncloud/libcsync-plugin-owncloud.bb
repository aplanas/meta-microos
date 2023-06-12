SUMMARY = "Owncloud plugin for csync"
DESCRIPTION = "This plug-in allows applications using csync to synchronize with Owncloud."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-plugin-owncloud-0.50.0-11.9.aarch64.rpm"
RPM_HASH = "aa778a823718baf5fd9544aef6f63e79fda76c5cb6b086e98622c18a6130a1986e8a3a5f0e63b9ea4c22c45394ce5b43096df6e0ba1284ed27e80ab01f8006f4"

RPROVIDES:${PN} += "libcsync-plugin-owncloud \
libcsync-plugin-owncloud(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.33)(64bit) \
libcsync.so.0()(64bit) \
libcsync0 \
libneon.so.27()(64bit)"

inherit rpm
