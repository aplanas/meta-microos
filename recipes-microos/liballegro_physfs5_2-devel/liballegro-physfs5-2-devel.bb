SUMMARY = "Development files for liballegro_physfs"
DESCRIPTION = "Development files needed to build applications which use liballegro_physfs."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_physfs5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "dba21b3f3800c7ee38d7cef3454074dd53335ae641f13aef483ae2915af51e0d0393d9b042daab20f07234ccb0e3cecd5deff6e09de798031289c420c26c47c6"

RPROVIDES:${PN} += "liballegro_physfs5_2-devel \
liballegro_physfs5_2-devel(aarch-64) \
pkgconfig(allegro_physfs-5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro_physfs5_2 \
pkgconfig(allegro-5)"

inherit rpm
