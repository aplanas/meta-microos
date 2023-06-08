SUMMARY = "KIWI - host requirements for container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build container images e.g docker, wsl"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-systemdeps-containers-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "b3d9b7c73f1f0f84473877aac7e1d5065387d27ad1f37e1292810bf028e3c4bde7611597ca134831c88a89a13630dd7ec92ebffb513eb51fa4c99e3530ad4c5c"

RPROVIDES:${PN} += "kiwi-image-docker-requires kiwi-image-wsl-requires kiwi-image:appx kiwi-image:docker kiwi-systemdeps-containers kiwi-systemdeps-containers(aarch-64)"
RDEPENDS:${PN} += "fb-util-for-appx skopeo umoci"

inherit rpm
