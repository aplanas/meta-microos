SUMMARY = "String munging for loggers"
DESCRIPTION = "string munging for loggers"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.101246"

RPM_NAME = "perl-String-Flogger-1.101246-1.2.noarch.rpm"
RPM_HASH = "a32b9ef4f9d9ddc85039bf8b993a0d3dd9aba8053da4a8d9ee7a4acc631cc9b4bce09c8cf67935f195d81a28e4b1c849c02fca2c10670e512aa953f7fc01070e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(String::Flogger) \
perl-String-Flogger"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(JSON::MaybeXS) \
perl(Params::Util) \
perl(Sub::Exporter) \
perl(Sub::Exporter::Util)"

inherit rpm
