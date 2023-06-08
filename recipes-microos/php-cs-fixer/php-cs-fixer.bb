SUMMARY = "PHP Coding Standards Fixer"
DESCRIPTION = "The PHP Coding Standards Fixer (PHP CS Fixer) tool fixes code to \
follow standards; this can be the PHP coding standards as defined \
in the PSR-1, PSR-2, etc., or other community driven ones like the \
Symfony one. Custom styles can also be defined through \
configuration."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "php-cs-fixer-3.13.0-1.2.noarch.rpm"
RPM_HASH = "3a25cdffe4ac56bff84b156d336945a276442f02bfa5dc471f57d5ece0761db8e314deab3d3375eb906167b627d2a628ad1d7ecec7ce4d839e426aba53f9405f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-cs-fixer"
RDEPENDS:${PN} += "php8-iconv php8-phar php8-tokenizer"

inherit rpm
