SUMMARY = "Provide utility methods for factory classes"
DESCRIPTION = "This module exports a method that is useful for factory classes."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.7"

RPM_NAME = "perl-Class-Factory-Util-1.7-14.24.noarch.rpm"
RPM_HASH = "6914d104ee223db9d9801b71882a6e78c1cc24f976610c373001181809aaa00602467fbaa76fd79d5b65895ab27da4a5381f97d4b004367a0abcffb91347f679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Factory::Util) perl-Class-Factory-Util"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
