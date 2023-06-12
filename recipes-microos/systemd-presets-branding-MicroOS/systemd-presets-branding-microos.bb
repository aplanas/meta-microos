SUMMARY = "Systemd default presets for openSUSE MicroOS"
DESCRIPTION = "Default presets for systemd on openSUSE MicroOS"
LICENSE = "MIT"

PV = "20230214"

RPM_NAME = "systemd-presets-branding-MicroOS-20230214-2.1.noarch.rpm"
RPM_HASH = "c3874cd9e3526e32a3a6cd2338a938ba96562250164db39bc835ce760c666500775995276d8afcc4c8be6cccae9d9d99b91071f6f90052b660898fa3cdc3716d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-MicroOS"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
