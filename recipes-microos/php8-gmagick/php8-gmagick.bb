SUMMARY = "Wrapper to the GraphicsMagick library"
DESCRIPTION = "PHP extension to create, modify and obtain meta information of images using \
the GraphicsMagick API"
LICENSE = "PHP-3.01"

PV = "2.0.6RC1"

RPM_NAME = "php8-gmagick-2.0.6RC1-3.3.aarch64.rpm"
RPM_HASH = "8d9ed63802a7b7846b063283777810b6d310d62d3b7c28ad0f554548029a06d81ee44ada6179ea6bef75f91c1c5bf8a5f2468705ee4230092f0552e37de7b66e"

RPROVIDES:${PN} += "config(php8-gmagick) php-gmagick php8-gmagick php8-gmagick(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGraphicsMagick-Q16.so.3()(64bit) libGraphicsMagickWand-Q16.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(OMP_5.0)(64bit) php(api) php(zend-abi)"

inherit rpm
