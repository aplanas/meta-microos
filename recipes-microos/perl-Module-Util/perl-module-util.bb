SUMMARY = "Module name tools and transformations"
DESCRIPTION = "This module provides a few useful functions for manipulating module names. \
Its main aim is to centralise some of the functions commonly used by \
modules that manipulate other modules in some way, like converting module \
names to relative paths."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-Module-Util-1.09-1.15.noarch.rpm"
RPM_HASH = "b35b42502e7c4fac838fbf0ee770ef634e8abc0df11c3832ac45004d96d8933ffa9e3a2787adafdf398ff6f85ada0eedcc2d5a601a877cbe5381e5bdb7aa2d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Util) \
perl-Module-Util"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
