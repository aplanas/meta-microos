SUMMARY = "KIWI - Host system dependencies"
DESCRIPTION = "Host setup helper to pull in all packages required/useful to \
leverage all functionality in KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-systemdeps-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "43306c7329cdf086092ebe0157a8c4f9c34f48ce57b6588f0cd9ac867d0d42ea67aee5a52aba35d98f044c895c05532607fdc0191e854bf7d0a5356c5004b5ff"

RPROVIDES:${PN} += "kiwi-systemdeps kiwi-systemdeps(aarch-64)"
RDEPENDS:${PN} += "kiwi-systemdeps-bootloaders kiwi-systemdeps-containers kiwi-systemdeps-core kiwi-systemdeps-disk-images kiwi-systemdeps-filesystems kiwi-systemdeps-image-validation kiwi-systemdeps-iso-media"

inherit rpm
