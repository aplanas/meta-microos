SUMMARY = "RPM dependency generator for Perl"
DESCRIPTION = "Provides and requires generator for .pl files and modules."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-build-perl-4.18.0-4.3.aarch64.rpm"
RPM_HASH = "02ba08f64e53ffe8fc4122b9e97a9a68ff2895e018cfc393b23835432014ad634e34cc25c4a0dfed07702c69c39804e63fb10bfaa8f88268f94cf0c0b9b8e03d"

RPROVIDES:${PN} += "rpm-build-perl rpm-build-perl(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl perl-base"

inherit rpm
