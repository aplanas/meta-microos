SUMMARY = "Succinct options for Moose"
DESCRIPTION = "This module provides a succinct syntax for declaring options for the Moose \
manpage attributes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-MooseX-Has-Options-0.003-5.25.noarch.rpm"
RPM_HASH = "b9bc5ae4cdd47dd6c7038de52264f0cff1cfc231f5a1d1a66c48bd6c71684e7366c4fefd426962e92c6e29443b6239964e13fe3f08ccd77acef389da087aa520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Has::Options) \
perl(MooseX::Has::Options::Handler::Accessors) \
perl(MooseX::Has::Options::Handler::NativeTypes) \
perl(MooseX::Has::Options::Handler::NoInit) \
perl-MooseX-Has-Options"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Load) \
perl(List::MoreUtils) \
perl(Package::Stash) \
perl(String::RewritePrefix)"

inherit rpm
