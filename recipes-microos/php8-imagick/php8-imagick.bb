SUMMARY = "Wrapper to the ImageMagick library"
DESCRIPTION = "PHP extension to create, modify and obtain meta information of images using \
the ImageMagick API."
LICENSE = "PHP-3.01"

PV = "3.7.0"

RPM_NAME = "php8-imagick-3.7.0-2.5.aarch64.rpm"
RPM_HASH = "59ba5c7086eb35bb60c23e224bf7a982454fc77746a9095ffd7abdbbea28ddbf15f0e1293827e2c1c80509e78c690da723593ee88173bfaaeaa0c4ccdb12227e"

RPROVIDES:${PN} += "config(php8-imagick) php-imagick php8-imagick php8-imagick(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagickCore-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgomp.so.1()(64bit) libgomp.so.1(OMP_5.0)(64bit) php(api) php(zend-abi)"

inherit rpm
