SUMMARY = "KIWI - host requirements for handling image descriptions better"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to handling image descriptions better. This also \
includes reading of image descriptions for different markup \
languages"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-systemdeps-image-validation-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "ac42bfd2dea69d0f4f6e40e7101abb458f79a61e89e47fbda01194296ad8d69e2c2b0c93e84411464413dd49775073e070d51e592167cac3d9a73c7ad0c1e42c"

RPROVIDES:${PN} += "kiwi-systemdeps-image-validation kiwi-systemdeps-image-validation(aarch-64)"
RDEPENDS:${PN} += "python3-solv"

inherit rpm
