SUMMARY = "Simple configuration file class"
DESCRIPTION = "Reading and writing configuration files is one of the most frequent tasks of \
any software design. Config::Simple is the library that helps you with it. \
 \
Config::Simple is a class representing configuration file object. It supports \
several configuration file syntax and tries to identify the file syntax \
automatically. Library supports parsing, updating and creating configuration \
files."
LICENSE = "Artistic-1.0"

PV = "4.59"

RPM_NAME = "perl-Config-Simple-4.59-19.29.aarch64.rpm"
RPM_HASH = "4bda9346df7c87c789980ee5f182907bd3ab1c11f25ea131cc9775b5acc7e376bff1b2347fa48cb88a44da32eb520f62f483654cd64671a3f9af7df18f81cab9"

RPROVIDES:${PN} += "perl(Config::Simple) perl-Config-Simple perl-Config-Simple(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(AutoLoader)"

inherit rpm
