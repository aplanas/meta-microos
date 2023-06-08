SUMMARY = "Read and write MySQL-style configuration files"
DESCRIPTION = "This module extends Config::INI to support reading and writing MySQL-style \
configuration files. Although deceptively similar to standard '.INI' files, \
they can include bare boolean options with no value assignment and \
additional features like '!include' and '!includedir'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-Config-MySQL-0.02-2.20.noarch.rpm"
RPM_HASH = "1c8e36aaa3405fb1c56548d0c4cc047f382effb0053c8f7c6ca7d6235e93865d76177a38c4d33332b14b119fa6d0d23f8d3e0f3d67ca53ca95bb24b48495691a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Config::MySQL) perl(Config::MySQL::Reader) perl(Config::MySQL::Writer) perl-Config-MySQL"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Config::INI::Reader) perl(Config::INI::Writer)"

inherit rpm
