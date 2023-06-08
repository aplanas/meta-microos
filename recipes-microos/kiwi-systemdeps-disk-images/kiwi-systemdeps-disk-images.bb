SUMMARY = "KIWI - host requirements for disk images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build disk images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-systemdeps-disk-images-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "430bac3a5dc5a73bf519981d332dfe472fcee82fe0aac24f6875d9127f6bea78446912c011068c504c275a6e56aee1bf7e375c7e9d93633ea73dace977558121"

RPROVIDES:${PN} += "kiwi-image-oem-requires kiwi-image-vmx-requires kiwi-image:oem kiwi-image:vmx kiwi-systemdeps-disk-images kiwi-systemdeps-disk-images(aarch-64)"
RDEPENDS:${PN} += "cryptsetup gptfdisk kiwi-systemdeps-bootloaders kiwi-systemdeps-filesystems kiwi-systemdeps-iso-media kpartx lvm2 mdadm parted util-linux util-linux-systemd"

inherit rpm
