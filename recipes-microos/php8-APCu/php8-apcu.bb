SUMMARY = "APCu - APC User Cache"
DESCRIPTION = "APCu is userland caching: APC stripped of opcode caching in preparation \
for the deployment of Zend Optimizer+ as the primary solution to opcode \
caching in future versions of PHP."
LICENSE = "PHP-3.01"

PV = "5.1.22"

RPM_NAME = "php8-APCu-5.1.22-2.3.aarch64.rpm"
RPM_HASH = "b9671aa549829e66123b3776b37c162b992cd7e4b4654acf116a79f7e6d2ede5db40e46076a9a1c2f68cd98213296097b75ac960ebc5dcb03fba04f6e0f3eb77"

RPROVIDES:${PN} += "config(php8-APCu) php-APCu php8-APCu php8-APCu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) php(api) php(zend-abi)"

inherit rpm
