SUMMARY = "EXIF metadata extensions for PHP"
DESCRIPTION = "PHP functions for extracting EXIF (Exchangable Image File Format; \
metadata from images) information stored in headers of JPEG and TIFF \
images."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-exif-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "5af2e88600f6ef51d0dab7d9ec5d2754f4e36ed309b9653cee7a6d1ff3d6b84d5c6a2e814e54f42df5f8022738342760a600d62cf770e867cdbba46478020ee2"

RPROVIDES:${PN} += "config(php8-exif) php-exif php8-exif php8-exif(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) php php-mbstring"

inherit rpm
