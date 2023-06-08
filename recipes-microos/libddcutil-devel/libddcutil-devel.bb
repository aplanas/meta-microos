SUMMARY = "Development files for libddcutil"
DESCRIPTION = "Header files and pkgconfig control file for libddcutil."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libddcutil-devel-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "d8ce71a19a14221bf5969bb797f77f67f3a0c15e2d4d07ea8663a0a578a1ee31ba983e19e82d28ed7f0d4261867c74d09d699d5040e17fe59c4b6c870be71242"

RPROVIDES:${PN} += "libddcutil-devel libddcutil-devel(aarch-64) pkgconfig(ddcutil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libddcutil4"

inherit rpm
