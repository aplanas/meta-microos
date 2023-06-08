SUMMARY = "GD Graphics Library extension for PHP"
DESCRIPTION = "PHP functions to create and manipulate image files in a variety of \
different image formats, including GIF, PNG, JPEG, WBMP, and XPM. Even \
more convenient: PHP can output image streams directly to a browser."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-gd-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "1152e33f7d094e7286fd5f6e03164cb797fe53bba3755d79f9c07116448d7a21d007d9840410f8fa12b56f822a714a301c24cd58c7f8ec54cb91ca71b4ef12a9"

RPROVIDES:${PN} += "config(php8-gd) php-gd php8-gd php8-gd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgd.so.3()(64bit) php"

inherit rpm
