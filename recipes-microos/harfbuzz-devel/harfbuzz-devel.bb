SUMMARY = "Development files for the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the development files."
LICENSE = "MIT"

PV = "7.2.0"

RPM_NAME = "harfbuzz-devel-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "39d844db7b3fa20566792c12be3ed2315c266c825c4c07806d8d30dcf655bd8b440a6179b918257a9f38d22f0c36e772624a8c5658693aa0e03d7210c23712ea"

RPROVIDES:${PN} += "harfbuzz-devel harfbuzz-devel(aarch-64) pkgconfig(harfbuzz) pkgconfig(harfbuzz-cairo) pkgconfig(harfbuzz-gobject) pkgconfig(harfbuzz-icu) pkgconfig(harfbuzz-subset)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libharfbuzz-gobject0 libharfbuzz-icu0 libharfbuzz-subset0 libharfbuzz0 pkgconfig(cairo) pkgconfig(freetype2) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(graphite2) pkgconfig(icu-uc) typelib-1_0-HarfBuzz-0_0"

inherit rpm
