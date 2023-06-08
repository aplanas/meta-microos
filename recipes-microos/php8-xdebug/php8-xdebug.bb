SUMMARY = "Extended PHP debugger"
DESCRIPTION = "The Xdebug extension helps debugging scripts by providing \
debug information such as: \
 \
  * stack and function traces in error messages with: \
    o full parameter display for user defined functions \
    o function name, file name and line indications \
    o support for member functions \
  * memory allocation \
  * protection for infinite recursions \
 \
Xdebug also provides: \
 \
  * profiling information for PHP scripts \
  * code coverage analysis \
  * capabilities to debug your scripts interactively with a debug client"
LICENSE = "PHP-3.0"

PV = "3.2.1"

RPM_NAME = "php8-xdebug-3.2.1-2.2.aarch64.rpm"
RPM_HASH = "6f61e16a061c4129d3f45e2f561fa3d205b17af40d64ece3807a01d66e6995c03b355fe1a397971bc383e7e64567ebffe4922b215963ae72dc387ed3174952b8"

RPROVIDES:${PN} += "config(php8-xdebug) php-xdebug php8-xdebug php8-xdebug(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.9)(64bit) php(api) php(zend-abi)"

inherit rpm
