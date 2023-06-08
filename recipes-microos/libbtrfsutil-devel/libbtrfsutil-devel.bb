SUMMARY = "Include Files and Libraries for developing with libbtrfsutil"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "libbtrfsutil-devel-6.1.3-5.1.aarch64.rpm"
RPM_HASH = "2568f08d542b847899b5ed0c259706709e6d0c06ce8a3e081476f19e0cd6d94e5c4e7aadf77fbbb41b9788a416c2cb8390403da35f6790b5d797f8afefbe8a14"

RPROVIDES:${PN} += "libbtrfsutil-devel libbtrfsutil-devel(aarch-64) pkgconfig(libbtrfsutil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config btrfsprogs libbtrfsutil1"

inherit rpm
