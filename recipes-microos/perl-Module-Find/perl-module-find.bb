SUMMARY = "Find and use installed modules in a (sub)category"
DESCRIPTION = "Module::Find lets you find and use modules in categories. This can be very \
useful for auto-detecting driver or plugin modules. You can differentiate \
between looking in the category itself or in all subcategories. \
 \
If you want Module::Find to search in a certain directory on your harddisk \
(such as the plugins directory of your software installation), make sure \
you modify '@INC' before you call the Module::Find functions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-Module-Find-0.16-1.2.noarch.rpm"
RPM_HASH = "08e67538a670db2102bc7473e1fc6b651fa6bf62d6b557f83cfae15a7504f387709ec6ce35237e81db35fa93b417e4fbab803e50458fc1be9bd75ce85fc731df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Find) perl-Module-Find"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
