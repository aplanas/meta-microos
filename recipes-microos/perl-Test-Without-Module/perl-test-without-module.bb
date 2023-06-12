SUMMARY = "Test fallback behaviour in absence of modules"
DESCRIPTION = "This module allows you to deliberately hide modules from a program even \
though they are installed. This is mostly useful for testing modules that \
have a fallback when a certain dependency module is not installed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-Test-Without-Module-0.21-1.2.noarch.rpm"
RPM_HASH = "35b2b52f6439bc8fd88d6ee8b5190cebd3fbc1844d7304ea203befe89743c5024b7963a4fa3d784e99ca2a8a4e3504c67568ab5e98ea6dbd397a4530ffda1a06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Without::Module) \
perl-Test-Without-Module"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
