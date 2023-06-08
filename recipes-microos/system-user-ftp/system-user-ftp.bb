SUMMARY = "System user and group ftp"
DESCRIPTION = "This package provides the system account and group 'ftp'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-ftp-20170617-24.14.noarch.rpm"
RPM_HASH = "fa5e482254ccc09b199eb558699181c7b2392110dd96e06b7374235ffb1a7eff335bf114fe31de67e71390b2643161cbfb491963953e7afa666cb9e65fb664ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(ftp) system-user-ftp user(ftp)"
RDEPENDS:${PN} += "/bin/sh sysuser-shadow"

inherit rpm
