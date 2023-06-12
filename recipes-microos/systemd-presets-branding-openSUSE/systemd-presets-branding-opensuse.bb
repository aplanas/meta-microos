SUMMARY = "Systemd default presets for openSUSE"
DESCRIPTION = "Default presets for systemd on openSUSE distribution. \
 \
These are the openSUSE specific presets. The default \
presets needed for all SUSE based distributions can be \
found in systemd-presets-common-SUSE."
LICENSE = "GPL-2.0-or-later"

PV = "12.2"

RPM_NAME = "systemd-presets-branding-openSUSE-12.2-21.2.noarch.rpm"
RPM_HASH = "4da516fbc72cf2934c2a20fe1494a9225fd5218b9a76579846ad9913170c94f44e4efc6cac87fc11d16518123695c5abd3fded421b8b8eb968005d17a8ff0a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh \
bash \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
