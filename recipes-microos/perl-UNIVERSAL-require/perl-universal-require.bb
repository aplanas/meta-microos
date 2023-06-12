SUMMARY = "Require() modules from a variable [deprecated]"
DESCRIPTION = "Before using this module, you should look at the alternatives, some of \
which are listed in SEE ALSO below. \
 \
This module provides a safe mechanism for loading a module at runtime, when \
you have the name of the module in a variable. \
 \
If you've ever had to do this... \
 \
    eval 'require $module'; \
 \
to get around the bareword caveats on require(), this module is for you. It \
creates a universal require() class method that will work with every Perl \
module and its secure. So instead of doing some arcane eval() work, you can \
do this: \
 \
    $module->require; \
 \
It doesn't save you much typing, but it'll make a lot more sense to someone \
who's not a ninth level Perl acolyte."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-UNIVERSAL-require-0.19-1.10.noarch.rpm"
RPM_HASH = "457a04e6bcf6fe581ef2962e7a3f361238e03981cede3877f833adf7871a6fdccd247ce72e101efe2218d9d92cf0c472faf1f39e53d366d92a751cdcb1c58b26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(UNIVERSAL) \
perl(UNIVERSAL::require) \
perl-UNIVERSAL-require"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
