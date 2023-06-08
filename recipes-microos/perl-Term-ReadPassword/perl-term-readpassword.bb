SUMMARY = "Term::ReadPassword - Asking the user for a password"
DESCRIPTION = "This module lets you ask the user for a password in the traditional \
way, from the keyboard, without echoing. \
 \
This is not intended for use over the web; user authentication over the \
web is another matter entirely. Also, this module should generally be \
used in conjunction with Perl's crypt() function, sold separately. \
 \
 \
 \
Authors: \
-------- \
    Tom Phoenix <rootbeer@redcat.com>"
LICENSE = "Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Term-ReadPassword-0.11-69.29.aarch64.rpm"
RPM_HASH = "7575dffb4056e3d2bb3cfa8e31cb7e0bf64f7ac1b2e40628126e08a2edbc2162ebb52f19b7ad3b8ee34683c15ef9f3ffcd1e0ac8430cb0a3c28898dbaab6d796"

RPROVIDES:${PN} += "perl(Term::ReadPassword) perl-Term-ReadPassword perl-Term-ReadPassword(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
