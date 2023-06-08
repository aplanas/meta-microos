SUMMARY = "The error messages files required by server, client and libmariadbd"
DESCRIPTION = "This package provides translated error messages for the standalone \
server daemon, embedded server and client."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.2"

RPM_NAME = "mariadb-errormessages-10.11.2-2.3.noarch.rpm"
RPM_HASH = "3481a09d21b36e82e0fd5392128e8a54015021b9f857cfae77ab2fca820937825d143786f0e7466085e836e57ec5cbbf9eaceaedc4175cbe3bf4163ed19b1ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mariadb-errormessages"
RDEPENDS:${PN} += ""

inherit rpm
