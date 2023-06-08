SUMMARY = "Thumbnailer for WebP images"
DESCRIPTION = "A thumbnailer for WebP images"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "tumbler-webp-thumbnailer-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "d19fb0c9d85a27ef8110c8e4d541981e851fb3700bf192ad2ee12ab1902c27be665aad7d3ea123d47d6922d6d8b08cb9c1665c32984b3ce0dac8e92416dee966"

RPROVIDES:${PN} += "tumbler-webp-thumbnailer tumbler-webp-thumbnailer(aarch-64)"
RDEPENDS:${PN} += "ImageMagick"

inherit rpm
