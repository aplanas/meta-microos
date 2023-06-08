SUMMARY = "Files and utilities used by daemons"
DESCRIPTION = "Miscellaneous files and utilities used by other libvirt daemons"
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-common-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "9b9a16e43d4182345b4bf2bbbd4486ac118ef7023fb496eb916b4e4f4c98b6dde70d59b483eeef45a870d4c546bb601a4d6c31e0289c8a88f66beeff3e173f6f"

RPROVIDES:${PN} += "config(libvirt-daemon-common) libvirt-admin libvirt-daemon-common libvirt-daemon-common(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh bash-completion dbus-1 dmidecode gettext-runtime group(libvirt) iproute ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libreadline.so.8()(64bit) libvirt-admin.so.0()(64bit) libvirt-admin.so.0(LIBVIRT_ADMIN_2.0.0)(64bit) libvirt-admin.so.0(LIBVIRT_ADMIN_3.0.0)(64bit) libvirt-admin.so.0(LIBVIRT_ADMIN_8.6.0)(64bit) libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_0.0.3)(64bit) libvirt.so.0(LIBVIRT_0.1.0)(64bit) libvirt.so.0(LIBVIRT_0.6.1)(64bit) libvirt.so.0(LIBVIRT_0.9.0)(64bit) libvirt.so.0(LIBVIRT_0.9.3)(64bit) libvirt.so.0(LIBVIRT_1.0.2)(64bit) libvirt.so.0(LIBVIRT_1.0.6)(64bit) libvirt.so.0(LIBVIRT_4.5.0)(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) logrotate pkgconfig(udev) systemd"

inherit rpm
