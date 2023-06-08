SUMMARY = "Systemd presets for Transactional Server System Role"
DESCRIPTION = "Service presets for systemd for Transactional Server System Role."
LICENSE = "MIT"

PV = "15.0"

RPM_NAME = "systemd-presets-branding-transactional-server-15.0-4.10.noarch.rpm"
RPM_HASH = "2b8dc7ebe26aa36bd100ed3beb5fe3df9d7a83791b8f5cc56c12458e3cfeaba62249a81775801668aec5b353cc50f84d2a82983d0dcc4411bfca2b8819408b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding-transactional-server"
RDEPENDS:${PN} += "/bin/sh bash coreutils systemd-presets-common-SUSE"

inherit rpm
