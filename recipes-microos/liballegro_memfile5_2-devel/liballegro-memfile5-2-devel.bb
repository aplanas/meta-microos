SUMMARY = "Development files for liballegro_memfile"
DESCRIPTION = "Development files needed to build applications which use liballegro_memfile."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_memfile5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "488d64233aa14257fce56c9b142b6ffc1d4fd78201caadaaeb6806c21b687084d33b944989e711e0df5ed89765c7eadabca5016cc3a1d9ee43017aa2ded663d4"

RPROVIDES:${PN} += "liballegro_memfile5_2-devel \
liballegro_memfile5_2-devel(aarch-64) \
pkgconfig(allegro_memfile-5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro_memfile5_2 \
pkgconfig(allegro-5)"

inherit rpm
