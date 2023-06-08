SUMMARY = "ICU integration for PHP"
DESCRIPTION = "The internationalization (intl) extension is a wrapper for the ICU \
library, enabling PHP programmers to perform UCA (Unicode Collation \
Algorithm) conformant collation as well as date, time, number and \
currency formatting in their scripts."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-intl-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "f17a5d80cecf5f1ec44f1cffd9b9f2a90842ea233507708ee8f34f53b5da59232ade7d7ae5e9bf099d643042429bcbba015b9b663925439f1df1e4d6304ea25f"

RPROVIDES:${PN} += "config(php8-intl) php-intl php8-intl php8-intl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuio.so.72()(64bit) libicuuc.so.72()(64bit) php"

inherit rpm
