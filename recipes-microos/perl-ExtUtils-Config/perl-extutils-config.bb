SUMMARY = "A wrapper for perl's configuration"
DESCRIPTION = "ExtUtils::Config is an abstraction around the %Config hash. By itself it is \
not a particularly interesting module by any measure, however it ties \
together a family of modern toolchain modules."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-ExtUtils-Config-0.008-1.26.noarch.rpm"
RPM_HASH = "1266c2b96af1064368245e988d0e44ad63f0ce29ca00802fafc9ff37a8d7daff9ee31644da4a22b5b352c6aa471a1c0827eb6d5481a6b9172ad67dab378a5f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(ExtUtils::Config) \
perl-ExtUtils-Config"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
