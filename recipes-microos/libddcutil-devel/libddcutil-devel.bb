SUMMARY = "Development files for libddcutil"
DESCRIPTION = "Header files and pkgconfig control file for libddcutil."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libddcutil-devel-1.4.1-2.1.aarch64.rpm"
RPM_HASH = "15eeb2bd657739a1c53d741420ea81c34aae74f38f4f8afc943a08cda9ed158d7ba748309b0a47cf326c490bcfdb16fdedf98d990be7973e9f93232a41b8f21b"

RPROVIDES:${PN} += "libddcutil-devel libddcutil-devel(aarch-64) pkgconfig(ddcutil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libddcutil4"

inherit rpm
