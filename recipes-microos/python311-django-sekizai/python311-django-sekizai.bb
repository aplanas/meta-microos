SUMMARY = "Django Template Blocks with extra functionality"
DESCRIPTION = "Django Template Blocks with extra functionality"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-django-sekizai-2.0.0-3.7.noarch.rpm"
RPM_HASH = "56083cda956f73a86ada3c42e55997669c8b95558739a47621820471a079333a0345a9944d4fc0a789dd7f69b5e4b9a03a9cc0eb7df9516fc60331868d9fef1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-sekizai) python311-django-sekizai python3dist(django-sekizai)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-django-classy-tags"

inherit rpm
