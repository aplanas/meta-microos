SUMMARY = "Contextual Tests That the Harness Can Ignore"
DESCRIPTION = "contextual tests that the harness can ignore"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Module-Install-ExtraTests-0.008-6.21.noarch.rpm"
RPM_HASH = "9cc9883bcb2d187e22ef0aa70253c2d21f6063dab62f5558af015c470a46f50322a015b534353d433beffe3cb9b618c0b81a3d199b4ae04823151e3603e62cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Install::ExtraTests) perl-Module-Install-ExtraTests"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
