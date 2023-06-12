SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software in C \
language, with interfaces to python and matlab, dedicated to frame data \
manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "python311-framel-8.42.3-1.5.aarch64.rpm"
RPM_HASH = "9ea63d37dbd3be71cd04f26e54cfefb29d5be1ebef8f7193fe5237a81e778709c65786af1a2694ca9a6e50c6df047b3ce0bf7ba10990be248fdf092877275a5b"

RPROVIDES:${PN} += "python3.11dist(framel) \
python311-framel \
python311-framel(aarch-64) \
python3dist(framel)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libframel.so.8()(64bit) \
libpython3.11.so.1.0()(64bit) \
python(abi)"

inherit rpm
