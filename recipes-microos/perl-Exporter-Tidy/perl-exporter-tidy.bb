SUMMARY = "Another way of exporting symbols"
DESCRIPTION = "This module serves as an easy, clean alternative to Exporter. Unlike \
Exporter, it is not subclassed, but it simply exports a custom import() \
into your namespace. \
 \
With Exporter::Tidy, you don't need to use any package global in your \
module. Even the subs you export can be lexically scoped."
LICENSE = "SUSE-Public-Domain"

PV = "0.08"

RPM_NAME = "perl-Exporter-Tidy-0.08-1.26.noarch.rpm"
RPM_HASH = "5036e2b23f332c29def9db796dc3b4bf20e264738238cc89494650926c96b70649686df6677f0e8b9529c39f80478b13f67c4305e6cdb98a7a8a84ea5bec4779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Exporter::Tidy) perl-Exporter-Tidy"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
