SUMMARY = "Wrapper to the GraphicsMagick library"
DESCRIPTION = "PHP extension to create, modify and obtain meta information of images using \
the GraphicsMagick API"
LICENSE = "PHP-3.01"

PV = "2.0.6RC1"

RPM_NAME = "php8-gmagick-2.0.6RC1-3.4.aarch64.rpm"
RPM_HASH = "3fc0f15e4431b23d9ecbb54668fc293d47d9478ca0ff64639e103637f26a8f35971a1706839ed95908dec0104469daf2e011417fb451928d8b5873e44870ebd4"

RPROVIDES:${PN} += "config(php8-gmagick) php-gmagick php8-gmagick php8-gmagick(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGraphicsMagick-Q16.so.3()(64bit) libGraphicsMagickWand-Q16.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(OMP_5.0)(64bit) php(api) php(zend-abi)"

inherit rpm
