SUMMARY = "Tool for boot loader configuration"
DESCRIPTION = "Shell script wrapper for configuring various boot loaders."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "perl-Bootloader-1.0-1.1.aarch64.rpm"
RPM_HASH = "e73c2424e8e1d05a77c0d056174af7d528406d31b7927cae3fa0d31c6a45fb2b59876dbabaed9c212be967fdc5d92dddb624d3ef354ebb2fb65270a46a134fb1"

RPROVIDES:${PN} += "/sbin/update-bootloader perl-Bootloader perl-Bootloader(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl coreutils perl-base"

inherit rpm
