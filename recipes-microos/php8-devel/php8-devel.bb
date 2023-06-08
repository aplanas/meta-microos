SUMMARY = "PHP development files for C/C++ extensions"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the C headers to build PHP extensions."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-devel-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "159e6951a3d6cb19119fe03da51e0cc9072a7e544937765420cb7ce0a627a53f65790360a4286d397edffdd8d7f97804b7d573c0dbf86933364383861fcc55ba"

RPROVIDES:${PN} += "php-devel php8-devel php8-devel(aarch-64) rpm_macro(pear_cfgdir) rpm_macro(pear_datadir) rpm_macro(pear_docdir) rpm_macro(pear_metadir) rpm_macro(pear_phpdir) rpm_macro(pear_testdir) rpm_macro(pear_wwwdir) rpm_macro(pear_xmldir) rpm_macro(pecl_datadir) rpm_macro(pecl_docdir) rpm_macro(pecl_phpdir) rpm_macro(pecl_testdir) rpm_macro(php_cfgdir) rpm_macro(php_core_api) rpm_macro(php_extdir) rpm_macro(php_pear_gen_filelist) rpm_macro(php_peardir) rpm_macro(php_pearxmldir) rpm_macro(php_version) rpm_macro(php_zend_api)"
RDEPENDS:${PN} += "/bin/sh glibc-devel php php8-pear php8-pecl pkgconfig(libpcre2-8) pkgconfig(libxml-2.0)"

inherit rpm
