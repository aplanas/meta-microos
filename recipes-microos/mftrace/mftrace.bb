SUMMARY = "Scalable PostScript Fonts for MetaFont"
DESCRIPTION = "Mftrace is a small Python program that lets you trace a TeX bitmap font \
into a PFA or PFB font (A PostScript Type1 Scalable Font) or TTF \
(TrueType) font."
LICENSE = "GPL-2.0-only"

PV = "1.2.20"

RPM_NAME = "mftrace-1.2.20-3.4.aarch64.rpm"
RPM_HASH = "425e359789436d4572dae61cc4844db464d0d3ad62dde5a4136618f38d0b23a3b0211c58148923109c3bff514b0258c341e05f523e86a6afec3695bdd100fc60"

RPROVIDES:${PN} += "mftrace \
mftrace(aarch-64)"
RDEPENDS:${PN} += "bitmap_tracing \
fontforge \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
t1utils \
texlive"

inherit rpm
