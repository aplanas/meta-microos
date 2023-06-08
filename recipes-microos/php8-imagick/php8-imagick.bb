SUMMARY = "Wrapper to the ImageMagick library"
DESCRIPTION = "PHP extension to create, modify and obtain meta information of images using \
the ImageMagick API."
LICENSE = "PHP-3.01"

PV = "3.7.0"

RPM_NAME = "php8-imagick-3.7.0-2.4.aarch64.rpm"
RPM_HASH = "ca55728854e14e3fa0b34644a2943d98d20d12c582739bbc9da911d48e7c695661c5e488d1ab2cbbf2662517f192ec5031446ba44bf8b993f5cb9cd75ee22fcd"

RPROVIDES:${PN} += "config(php8-imagick) php-imagick php8-imagick php8-imagick(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagickCore-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgomp.so.1()(64bit) libgomp.so.1(OMP_5.0)(64bit) php(api) php(zend-abi)"

inherit rpm
