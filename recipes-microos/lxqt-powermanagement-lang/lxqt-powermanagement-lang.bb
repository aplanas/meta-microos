SUMMARY = "Translations for package lxqt-powermanagement"
DESCRIPTION = "Provides translations for the 'lxqt-powermanagement' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-powermanagement-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "fe94edd783d9541d169fe5491b2f1a10b8acecee3462e3de44b6871e4a2d637e18c815147a981b716c32d57070ecf187aeb9faf89413aa71590e5c89857d405b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-powermanagement-lang lxqt-powermanagement-lang-all"
RDEPENDS:${PN} += "lxqt-powermanagement"

inherit rpm
