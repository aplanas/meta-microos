SUMMARY = "UNIVERAL::moniker"
DESCRIPTION = "Class names in Perl often don't sound great when spoken, or look good when \
written in prose. For this reason, we tend to say things like 'customer' or \
'basket' when we are referring to 'My::Site::User::Customer' or \
'My::Site::Shop::Basket'. We thought it would be nice if our classes knew \
what we would prefer to call them. \
 \
This module will add a 'moniker' (and 'plural_moniker') method to \
'UNIVERSAL', and so to every class or module."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.08"

RPM_NAME = "perl-UNIVERSAL-moniker-0.08-13.26.noarch.rpm"
RPM_HASH = "47f2c269e791f6845c1ff5aa0eb98a4893858ded1128a50eed931f608a58d8b18d0819ff6a48c4a0b0fe4f19fa5c8029d9adefd2955c96315a4588fe1250b1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(UNIVERSAL) perl(UNIVERSAL::moniker) perl-UNIVERSAL-moniker"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
