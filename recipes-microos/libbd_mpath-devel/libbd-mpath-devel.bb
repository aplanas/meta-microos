SUMMARY = "Development files for the libblockdev-mpath plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_mpath plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_mpath-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "747f74955f0f561a059b51cd886d64f82876e13d48f18065d92bfd49de6b9e3ff6507fe677d8758d84819b1db8daefd7c3a6c02a9d0d786f91e539631a291684"

RPROVIDES:${PN} += "libbd_mpath-devel libbd_mpath-devel(aarch-64) libblockdev-mpath-devel"
RDEPENDS:${PN} += "glib2-devel libbd_mpath2 libbd_utils-devel"

inherit rpm
