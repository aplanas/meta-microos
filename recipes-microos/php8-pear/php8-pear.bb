SUMMARY = "PHP Extension and Application Repository"
DESCRIPTION = "PEAR is a code repository for PHP extensions and PHP library code \
similar to TeX's CTAN and Perl's CPAN. This package provides an access \
to the repository. \
 \
See https://pear.php.net/manual for more details."
LICENSE = "BSD-2-Clause"

PV = "1.10.21"

RPM_NAME = "php8-pear-1.10.21-1.6.noarch.rpm"
RPM_HASH = "ef8f1a51049874f9ae3d4a822e2faa2f53bc140d29fbcebdc00144af3f2fea535f260b71deebb3dd09b93edc7cbdb69b9b5c1084ed2bf634b9ed1f0657c5fda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(php8-pear) php-pear php-pear(Archive_Tar) php-pear(Console_Getopt) php-pear(PEAR) php-pear(Structures_Graph) php-pear(XML_Util) php8-pear"
RDEPENDS:${PN} += "/bin/sh php8-cli php8-openssl php8-phar"

inherit rpm
