SUMMARY = "VDE management files"
DESCRIPTION = "This package contains VDE management files"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdemgmt-devel-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "f225408894645f15b46d034fb9d3892fb71f11dd4eebf2d4fe2a8033a42de298629008ab20ef5c75c8ffcf01fa11807c2ad0922369d31c7ab59e81d6c4197119"

RPROVIDES:${PN} += "libvdemgmt-devel libvdemgmt-devel(aarch-64) libvdemgmt0-devel pkgconfig(vdemgmt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvdemgmt0 vde2"

inherit rpm
