SUMMARY = "KIWI - host requirements for configuring bootloaders"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host for configuring bootloaders on images."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-systemdeps-bootloaders-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "0416a0df1caa228efc1ef0396a1ce138598e4ea874671c63d435fc9e3e3c1fedd80aeade4b165d24386ae8b60866975554eb8681287385a3ee7d92141355f2a3"

RPROVIDES:${PN} += "kiwi-systemdeps-bootloaders kiwi-systemdeps-bootloaders(aarch-64)"
RDEPENDS:${PN} += "grub2 kiwi-systemdeps-core u-boot-tools"

inherit rpm
