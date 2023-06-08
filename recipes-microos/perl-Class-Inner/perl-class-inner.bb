SUMMARY = "A perlish implementation of Java like inner classes"
DESCRIPTION = "Yet another implementation of an anonymous class with per object \
overrideable methods, but with the added attraction of sort of working \
dispatch to the parent class's method."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.200001"

RPM_NAME = "perl-Class-Inner-0.200001-13.26.noarch.rpm"
RPM_HASH = "e11af05f95d13324b64eef332e1b7c4f7e1a52056ef2563e9c673608b81a9aebdee8ca69aca9f10a69f613b6bad7e38a44bc0e36b463c5764a8dcc7d0deb1224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Inner) perl-Class-Inner"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
