SUMMARY = "(DEPRECATED) use Moo instead!"
DESCRIPTION = "(DEPRECATED) use Moo instead!"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-Any-Moose-0.27-1.23.noarch.rpm"
RPM_HASH = "b3736e73692034510c6b4ad10811a8dc334d4efe47368fb9e80c7e8197eb051a75da83af03d96261b22f34a872f7e117fa9e06eeec2cf00a05ec95d2421b6f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Any::Moose) \
perl-Any-Moose"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose)"

inherit rpm
