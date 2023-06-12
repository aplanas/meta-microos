SUMMARY = "Simple parsing of RFC2822 message format and headers"
DESCRIPTION = "The Email:: namespace was begun as a reaction against the increasing \
complexity and bugginess of Perl's existing email modules. 'Email::*' \
modules are meant to be simple to use and to maintain, pared to the bone, \
fast, minimal in their external dependencies, and correct."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.218"

RPM_NAME = "perl-Email-Simple-2.218-1.1.noarch.rpm"
RPM_HASH = "d1b13a126e020bb113140f4a70595f3be3d102a5b8448cef2fdd73a3dcfaa9bd61009fa34c5d52ee3dfc1554bfbd7e0faf1d4f326489d236c654c766f1f10b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Email::Simple) \
perl(Email::Simple::Creator) \
perl(Email::Simple::Header) \
perl-Email-Simple"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Email::Date::Format)"

inherit rpm
