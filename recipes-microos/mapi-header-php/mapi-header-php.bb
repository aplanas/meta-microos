SUMMARY = "Common PHP MAPI header files for grommunio"
DESCRIPTION = "PHP files shared between grommunio-web, grommunio-sync and other PHP \
applications from the groupware suite."
LICENSE = "AGPL-3.0-or-later"

PV = "1.1.0.70e984f"

RPM_NAME = "mapi-header-php-1.1.0.70e984f-1.1.noarch.rpm"
RPM_HASH = "f8371959dda212b9fe02512b452f6de40ee76d015286c9fc7b3a638437ef0f818617b0e99b9da139f917c0f0a46765a393f05be7cabf9fda68ddf4987c12d593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mapi-header-php"
RDEPENDS:${PN} += ""

inherit rpm
