SUMMARY = "Rsync for cloud storage"
DESCRIPTION = "rsync for cloud storage. rclone is a command line program to sync files and \
directories to and from a wide variety of cloud storage providers, providing \
various additional features."
LICENSE = "MIT"

PV = "1.62.2"

RPM_NAME = "rclone-1.62.2-2.1.aarch64.rpm"
RPM_HASH = "c0265ccb08303ef59db6a9e39f28166753ec35ab0376bcfd1bdd6bf363c2350f6fb0319223c9aaac256b6a75f2d442f8c8251e1c931eac7ee10491afb2662879"

RPROVIDES:${PN} += "rclone rclone(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
