SUMMARY = "KIWI - host requirements for live and install iso images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build live and install iso images."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-systemdeps-iso-media-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "42205cc07a57a1d44263bf02d2fcb38b07574c96ddeaf4bbd6366ce1ba110f87db4710025ed3e0793ac3a6095783250f6d5d11aa404d554b21087d0fea13a68d"

RPROVIDES:${PN} += "kiwi-image-iso-requires kiwi-image:iso kiwi-systemdeps-iso-media kiwi-systemdeps-iso-media(aarch-64)"
RDEPENDS:${PN} += "checkmedia kiwi-systemdeps-bootloaders kiwi-systemdeps-core kiwi-systemdeps-filesystems xorriso"

inherit rpm
